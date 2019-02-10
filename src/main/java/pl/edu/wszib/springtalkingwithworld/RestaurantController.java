package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.edu.wszib.springtalkingwithworld.model.Klient;
import pl.edu.wszib.springtalkingwithworld.model.Restauracja;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

    @GetMapping("koszt/{imie}/{imieOsobyTowarzyszacej}/{imieDziecka}/{imieZwierzecia}")
    public ResponseEntity koszt (@RequestParam("imie") String imie,
                                 @RequestParam(value="imieOsobyTowarzyszacej", required = false) String imieOsobyTowarzyszacej,
                                 @RequestParam(value ="imieDziecka", required = false) String imieDziecka,
                                 @RequestParam(value ="imieZwierzecia", required = false) String imieZwierzecia
                                 ) {
        Klient  k = new Klient();
        k.imie = imie;
        k.osobaTowrzyszaca = imieOsobyTowarzyszacej==null ? false : true;
        k.dziecko = imieDziecka == null ? false : true;
        k.zwierze = imieZwierzecia == null ? false : true;

         return ResponseEntity.ok(Restauracja.koszt(k));
    }


}
