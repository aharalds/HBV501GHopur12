package testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

/**
 * 
 * @author Hörn Heiðarsdóttir
 * hoh45@hi.is
 *
 */

public class HttpRequestTest {
	
	// Búum til random port
	@LocalServerPort
	private int port;
	
	// Client klasi til að nota í integration testing og notar Http API
	@Autowired
	private TestRestTemplate restTemplate;
	
	/**
	 * Aðferð sem athugar hvort virkar að senda HttpRequest á heimaslóðina (/spyrjaNotanda)
	 * og fá til baka .jsp skrána askUser sem inniheldur strenginn "Nauðsynlegar upplýsingar"
	 */
    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
                String.class)).contains("Nauðsynlegar upplýsingar");
    }
}
