package testing;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * 
 * @author Hörn Heiðarsdóttir
 * hoh45@hi.is
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class ApplicationTest {
	
	// Keyrum upp prufuþjón
	@Autowired
	private MockMvc mockMvc;
	
	/**
	 * Aðferð sem athugar hvort virkar að senda HttpRequest á slóðina "/aboutDiet"
	 * sem vísar yfir á userInfo.jsp sem inniheldur strenginn "Góðan daginn"
	 */
	
	@Test
	public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/aboutDiet")).andDo(print()).andExpect(status().isOk())
        .andExpect(content().string(containsString("Góðan daginn")));
    }
	
}
