package is.hi.hopur12.repository;

import is.hi.hopur12.model.Food;
import is.hi.hopur12.model.Nutrition;
import is.hi.hopur12.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/*
 * Repository fyrir User klasa.
 * Talar við Service klasa.
 */
public interface NutritionRepository extends JpaRepository<Nutrition,Long> {
	
	/*
	 * Vistar gögn í gagnagrunn
	 * Tekur Nutrition object og vistar í gagnagrunns töflu.
	 */
	Nutrition save(Nutrition nutrition);
	@Override
	Nutrition findOne(Long id);

}
