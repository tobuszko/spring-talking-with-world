package pl.edu.wszib.springtalkingwithworld;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("/cal")
public class Calculator {

                                                                                                                                                                         


    @GetMapping("/sum")
    public ResponseEntity sum (@RequestParam("number") int[] numbers){
        return ResponseEntity.ok(Arrays.stream(numbers).sum());
    }

    @GetMapping("/avg")
    public ResponseEntity avg (@RequestParam("number") int[] numbers){
        return ResponseEntity.ok(Arrays.stream(numbers).average());
    }

    @GetMapping("/count")
    public ResponseEntity count (@RequestParam("number") int[] numbers){
        return ResponseEntity.ok(Arrays.stream(numbers).count());
    }


    @GetMapping("/multiply")
    public ResponseEntity multiply (@RequestParam("number") int[] numbers){
        int j=1;
        for (int i: numbers){
            j = j * i;
        }
        return new ResponseEntity(j, HttpStatus.OK );
    }



}
