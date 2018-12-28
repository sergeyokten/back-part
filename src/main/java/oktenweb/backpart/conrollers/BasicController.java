package oktenweb.backpart.conrollers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/rest")
@CrossOrigin(origins = "http://localhost:4200")
public class BasicController {


    @GetMapping("/")
    public String home() {
        return "home response";
    }

    @GetMapping("/user/a")
    public String userA() {
        return "answer userA";
    }
}
