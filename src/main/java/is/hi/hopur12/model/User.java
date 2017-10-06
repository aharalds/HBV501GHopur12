package is.hi.hopur12.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import is.hi.hopur12.model.Nutrition;

@Entity
@Table (name="aboutUser")
public class User {
	@Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
	private String name;
	private double age;
	private double weight;
	private double height;
	private double bmr;
	private String gender;
	private String workout;
	private String goal;
	
	/*public User(String name, double age, double weight, double height, double bmr) {
		setName(name);
		setAge(age);
		setWeight(weight);
		setHeight(height);
		setBmr(bmr);
	}*/
	@Embedded
	private Nutrition nutrition;
	
	public void setNutrition(Nutrition nutrition) {
		this.nutrition = nutrition;
	}
	
	public Nutrition getNutrition() {
		return nutrition;
	}
	
	public User() {
		
	}

	public void setWorkout(String workout) {
		this.workout = workout;
	}
	
	public String getWorkout() {
		return workout;
	}
	
	public void setGoal(String goal) {
		this.goal = goal;
	}
	
	public String getGoal() {
		return goal;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getBmr() {
		return bmr;
	}
	
	public void setBmr(double bmr) {
		this.bmr = bmr;
	}

	/*public int getWorkout() {
		return workout;
	}

	public void setWorkout(int workout) {
		this.workout = workout;
	}*/

	@Override
	public String toString() {
		return "age = " + age + ", weight = " + weight + ", height = " + height + ", workout = "
				;
	}
}
