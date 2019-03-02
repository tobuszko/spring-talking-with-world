package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController - domyślnie ma @ResponseBody
//@Controller
@RestController
@RequestMapping("/headers")
public class HeaderController {

/*    @GetMapping
    @ResponseBody
    public String  test (@RequestHeader String testHeader) {
        return testHeader.toUpperCase();
    }*/


    @GetMapping
    public String test () {
        return "index";
    }

    @ExceptionHandler(RuntimeException.class)
    public String exception(){
        return "Exception occured";
    }


}
