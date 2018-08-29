package message;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.Collection;
import java.util.List;

 @Controller
public class MessageController {

    /*@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }*/
	
	private final MessageRepository repository;
	
	public MessageController(MessageRepository message) {
		this.repository = message;
	}

    @GetMapping("/")
    public String showForm(Model model, Message message) {
    	List<Message> l = repository.findAll();
		model.addAttribute("messages", l);
        return "form";
    }

    @PostMapping("/")
    public String saveMessage(@ModelAttribute(name="message")Message message, BindingResult result) {
    	repository.save(message);  

        return "redirect:/";
    }
}
