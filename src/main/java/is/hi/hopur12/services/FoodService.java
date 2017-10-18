package is.hi.hopur12.services;

import java.util.List;

import is.hi.hopur12.model.*;

/*
 * Interface klasi fyrir service
 * Atli Haraldsson
 * HBV501G
 */
public interface FoodService {
	
	/*
	 * Vistar gögn í gagnagrunni
	 * @user er model af taginu User.
	 */
	public Food save(Food food);
	
	public List<Food> allFood();
	

}
