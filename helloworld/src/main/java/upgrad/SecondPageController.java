package upgrad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecondPageController {

    @RequestMapping("/secondspring")
    public String index() {
        return "secondpage";
    }

}
