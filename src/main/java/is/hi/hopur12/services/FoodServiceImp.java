package is.hi.hopur12.services;

import org.springframework.stereotype.Component;

import is.hi.hopur12.model.Food;
import is.hi.hopur12.repository.FoodRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * Service klasi
 * Atli Haraldsson
 * HBV501G
 */
@Component
public class FoodServiceImp implements FoodService {
	
    
	@Autowired
    FoodRepository foodRep;
    
	@Override
	public Food save(Food food) {
		return foodRep.save(food);
	}
	
	@Override
    public List<Food> allFood() {
        return foodRep.findAll(); 
    }

}
