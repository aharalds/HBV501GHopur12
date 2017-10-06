package is.hi.hopur12.services;

import org.springframework.stereotype.Component;
import is.hi.hopur12.model.User;
import is.hi.hopur12.model.Nutrition;
import is.hi.hopur12.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * Service klasi
 * Atli Haraldsson
 * HBV501G
 */
@Component
public class UserServiceImp implements UserService {
	
    
	@Autowired
    UserRepository userRep;
	Nutrition nutrition;
    
	//Reiknar æskilegt magn af proteini per dag
	@Override
	public double calcProtein(double bmr) {
		return (0.3*bmr)/4;
	}
	
	//Reiknar æskilegt magn af fitu per dag
	@Override
	public double calcFat(double bmr) {
		return (0.2*bmr)/9;

	}
	
	//Reiknar æskilegt magn af carbs per dag
	@Override
	public double calcCarbs(double bmr) {
		return (0.5*bmr)/4;
	}
	
	// Næringargildi sem æskileg eru með tilliti til útreiknaðs
	// BMRs, úr upplýsingum sem fengnar eru.
	@Override
	public Nutrition calcAll(double bmr) {
		Nutrition nut = new Nutrition(calcProtein(bmr),calcCarbs(bmr), calcFat(bmr));
		return nut;
		
	}
	// Vistar User object í gagnagrunnstöflunni "about_user" með Embedded object Nutrition.
	@Override
    public User save(User user) {
        return userRep.save(user);
    }
	// Reiknar BMR fyrir objectið user
	// Tekur tillit til hreyfingar og markmiða
	@Override
	public void calcBMR(User u) {
		double bmrx = 0.0;
		if(u.getGender().contentEquals("M")) {
			bmrx = 66.5 + (13.75*u.getWeight()) + (5.003*u.getHeight()) - (6.755*u.getAge());
		}
		if (u.getGender().contentEquals("F")) {
			bmrx = 655.1 + (9.563*u.getWeight()) + (1.85*u.getHeight()) - (4.676*u.getAge());
		}
		if(u.getGoal().contentEquals("1")) {
			bmrx = bmrx-500;
		} else if (u.getGoal().contentEquals("3")) {
			bmrx = bmrx+500;
		}
		
		checkWorkout(u,bmrx);
	}
	
	// Hendir réttu BMR í objectið user
	// Með tilliti til hreyfingar og markmiða
	public void checkWorkout(User u, double bmr) {
		if(u.getWorkout().contentEquals("1"))
			u.setBmr(bmr*1.2);
		else if(u.getWorkout().contentEquals("2"))
			u.setBmr(bmr*1.375);
		else if(u.getWorkout().contentEquals("3"))
			u.setBmr(bmr*1.55);
		else if(u.getWorkout().contentEquals("4"))
			u.setBmr(bmr*1.725);
		else if(u.getWorkout().contentEquals("5"))
			u.setBmr(bmr*1.9);
	}
	
	
	
/*	
    @Override
    public List<User> allUsers() {
        return userRep.findAll();
        */

}
