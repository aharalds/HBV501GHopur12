package is.hi.hopur12.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import is.hi.hopur12.model.Nutrition;

@Entity
@Table (name="user_details")
public class UserDetails {

    private Long userdetail_id;
	private int age;
	private int weight;
	private int height;
	private int bmr;
	private String gender;
	private String workout;
	private String goal;
	
	public UserDetails(int age, int weight, int height, int bmr) {
		setAge(age);
		setWeight(weight);
		setHeight(height);
		setBmr(bmr);
	}
	
	@Id
    @Column(name="userdetail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return userdetail_id;
    }

    public void setId(Long userdetail_id) {
        this.userdetail_id = userdetail_id;
    }
	
	public UserDetails() {
		
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
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getBmr() {
		return bmr;
	}
	
	public void setBmr(int bmr) {
		this.bmr = bmr;
	}
}
