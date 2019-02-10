package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("/parameterTest")
public class RequestController {

    @GetMapping
    public ResponseEntity get(@RequestParam("pierwesza") int[] liczba1){
        return ResponseEntity.ok(Arrays.stream(liczba1).count());

    }




}
