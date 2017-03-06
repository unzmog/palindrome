package palindrome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PalindromeController {
	
	@Autowired
	private PalindromeService service;

    @GetMapping("/")
    public String greetingForm(Model model) {
        model.addAttribute("palindrome", new PalindromeModel());
        return "form";
    }

    @PostMapping("/")
    public String greetingSubmit(@ModelAttribute PalindromeModel model) {
    	model.setResult(service.check(model.getText()));
        return "result";
    }

}