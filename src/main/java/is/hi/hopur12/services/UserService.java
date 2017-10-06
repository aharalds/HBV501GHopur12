package is.hi.hopur12.services;

import is.hi.hopur12.model.*;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * Interface klasi fyrir service
 * Atli Haraldsson
 * HBV501G
 */
public interface UserService {
	
	/*
	 * Vistar gögn í gagnagrunni
	 * @user er model af taginu User.
	 */
	public User save(User user);
	
	/*
	 * Reiknar út æskilegt BMR úr uppgefnum gögnum
	 * @u er User model.
	 */
	public void calcBMR(User u);
	
	/*
	 * Reiknar æskilegt magn af proteini per dag.
	 * @bmr er BMR gildi sem fæst úr calcBMR()
	 */
	public double calcProtein(double bmr);
	
	/*
	 * Reiknar æskilegt magn af proteini per dag
	 * @bmr er BMR gildi sem fæst úr calcBMR()
	 */
	public double calcCarbs(double bmr);
	
	/*
	 * Reiknar æskilegt magn af fitu per dag
	 * @bmr er BMR gildi sem fæst úr calcBMR()
	 */
	public double calcFat(double bmr);
	
	/*
	 * Býr til nýtt Nutrition object sem er embeddad í User object
	 * @bmr er BMR gildi sem fæst úr calcBMR()
	 */
	public Nutrition calcAll(double bmr);
	
	/*
	 * Tekur tillit til hreyfingar aðila og finnur endanlegt BMR
	 * @bmr er BMR gildi sem fæst úr calcBMR()
	 * @u er user object.
	 */
	public void checkWorkout(User u, double bmr);
	
	
	

}
