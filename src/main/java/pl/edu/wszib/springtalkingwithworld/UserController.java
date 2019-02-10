package pl.edu.wszib.springtalkingwithworld;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    List<String> imieNazwiskoList = new ArrayList<>();


    @GetMapping("/istniej/{imie}/{nazwisko}")
    public ResponseEntity istnieje (@PathVariable String imie, @PathVariable String nazwisko) {
        ResponseEntity entity;
        String imieNazwisko = imie + nazwisko;
        if (imieNazwiskoList.contains(imieNazwisko) ) {
            entity = new ResponseEntity("istniej", HttpStatus.OK);
        } else {
            entity = new ResponseEntity("nie istniej", HttpStatus.resolve(204));
        }
        return entity;
    }

    @PostMapping("/zapisz/{imie}/{nazwisko}")
    public ResponseEntity zapisz (@PathVariable String imie, @PathVariable String nazwisko) {
        ResponseEntity entity;
        String imieNazwisko = imie + nazwisko;
        if (imieNazwiskoList.contains(imieNazwisko) ) {
            entity = new ResponseEntity("Użytkownik istnieje",HttpStatus.resolve(404));
        } else {
            imieNazwiskoList.add(imieNazwisko);
            entity = new ResponseEntity("Zapisane",HttpStatus.resolve(200));
        }
        return entity;
    }


    @DeleteMapping("/usun/{imie}/{nazwisko}")
    public ResponseEntity usun (@PathVariable String imie, @PathVariable String nazwisko) {
        ResponseEntity entity;
        String imieNazwisko = imie + nazwisko;
        if (imieNazwiskoList.contains(imieNazwisko) ) {
            imieNazwiskoList.remove(imieNazwisko);
            entity = new ResponseEntity("usunięto",HttpStatus.resolve(200));
        } else {

            entity = new ResponseEntity("nie ma takiego uzytkownika",HttpStatus.resolve(204));
        }
        return entity;
    }

}
