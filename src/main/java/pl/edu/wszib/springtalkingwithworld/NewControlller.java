package pl.edu.wszib.springtalkingwithworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/new")
public class NewControlller {


    @GetMapping
    public String newOne () {
        throw new runTimeException1();
    }



}


