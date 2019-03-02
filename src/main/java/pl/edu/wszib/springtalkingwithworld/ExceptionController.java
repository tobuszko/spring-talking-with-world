package pl.edu.wszib.springtalkingwithworld;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Controller
@RequestMapping("/exceptions")
public class ExceptionController {



    @GetMapping
    public String test () {
        Random r = new Random();
        int i = r.nextInt(3);

        if (i == 0) {
            throw new runTimeException1();
        }
        if (i == 1) {
            throw new runTimeException2();
        }
        if (i == 2) {
            throw new runTimeException3();
        }

        return "bez błedu";
    }

/*
    @ExceptionHandler(runTimeException1.class)
    public String exception1(){
        return "face1";
    }


    @ExceptionHandler(runTimeException2.class)
    public String exception2(){
        return "face2";
    }

    @ExceptionHandler(runTimeException3.class)
    public String exception3(){
        return "face3";
    }
*/


}
