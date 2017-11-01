package testing;

import is.hi.hopur12.controller.GreetingController;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest


/**
 * @author Hörn Heiðarsdóttir
 * hoh45@hi.is 
 * 
 * Þessi prófun er til að athuga hvort að forritið keyri og eins hvort að einhver af controller klösunum verði til
 **/

public class SmokeTest {
	
	@Autowired
	GreetingController greetingController;
	
	/**
	 * Aðferð til að athuga hvort controllerinn hefur verið búinn til
	 **/
	
	@Test
	public void contextLoads() {
		assertThat(greetingController).isNotNull();
	}
}
