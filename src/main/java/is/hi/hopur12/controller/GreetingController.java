/**
* Innskráning og heilsa. 
* 
* Hópur 12
* Atli Haraldsson ath174@hi.is
* Sindri Þór Guðmundsson sthg11@hi.is
* Jónas Bergsteinsson job33@hi.is
* HBV501G - Hugbúnaðarverkefni 1
*/

package is.hi.hopur12.controller;

import is.hi.hopur12.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;

import is.hi.hopur12.model.User;

/*
 * Control klasi fyrir greetings. Hefur í samskiptum við "/greeting/*.jps" skrár.
 */

@Controller
@RequestMapping("/greeting") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /greeting fyrir allar skipanir 
public class GreetingController {
	
	@Autowired
	UserService userServ;

    // Þar sem klasinn hefyr slóðina "/greeting", er þessi slóð "/greeting/notandi"
    // Skilar út .jps skránni "/webapp/WEB-INF/vefvidmot/greeting/showUser.jsp"
    // með harðkóðuðu attribute-i.
    @RequestMapping("/notandi")
    public String notandi (Model model) {
    	model.addAttribute("nafn", "Atli");
    	return "greeting/showUser";
    }
    
    // Þar sem klasinn hefur slóðina "/greeting", er þessi slóð "/greeting/synaNotanda"
    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotandi () {
    	return "greeting/askUser"; // skilar .jsp skrá sem er /webapp/WEB-INF/vefvidmot/greeting/askUser.jsp
    }
    
    // Þar sem klasinn hefur slóðina "/greeting", er þessi slóð "/greeting/hver"
    // Skilar .jsp skrá sem er "/webapp/WEB-INF/vefvidmot/greeting/askUser.jsp"
    // með texta úr "input" glugga.
    @RequestMapping(value="/hver", method=RequestMethod.POST)
    public String hver (@RequestParam(value="nafn", required=false)
    	String nafn, ModelMap model) {
    	model.addAttribute("nafn", nafn);
    	return "greeting/showUser";
    }
    
    /*
     * Tekur upplýsingar úr POST methodinu "userInfo"
     * Notar þær upplýsingar til að finna æskilegar næringarupplýsingar
     * Notar UserService klasana og Model klasa.
     * Vísar þér yfir á userInfo.jsp þar sem upplýsingar eru komnar í töflu.
     */
    @RequestMapping(value="/aboutDiet", method=RequestMethod.POST)
    public String aboutDiet(@ModelAttribute("userInfo") User u,
    	ModelMap model) {
    	userServ.calcBMR(u);
    	u.setNutrition(userServ.calcAll(u.getBmr()));
    	model.addAttribute("userInfo", u);
    	userServ.save(u);
    	return "greeting/userInfo";	
    }
    
}

