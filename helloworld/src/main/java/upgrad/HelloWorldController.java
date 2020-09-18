package upgrad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/hellospring")
    public String helloSpring() {
        return "index";
    }
    @RequestMapping("/2secondspring")
    @ResponseBody
    public String secondpg() {// Important : Note this method definition
        return "Hello." + "The time is " + new java.util.Date();
    }

    @RequestMapping("/techblog")
    public String techblog() {// Important : Note this method definition
        return "secondpage";
    }


}
