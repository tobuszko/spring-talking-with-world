package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springtalkingwithworld.model.BiletDTO;
import pl.edu.wszib.springtalkingwithworld.model.Bill;
import pl.edu.wszib.springtalkingwithworld.model.Osoba;
import pl.edu.wszib.springtalkingwithworld.model.OsobaDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping("/bill")
public class TicketController {

     Map<String, Bill> myMap = new HashMap<String, Bill>();

    @GetMapping("/{id}")
    public ResponseEntity<BiletDTO> odbierzBill (@PathVariable String id) {
            return ResponseEntity.ok(convert(myMap.get(id)));
    }

    @PostMapping
    public ResponseEntity dodaj (@RequestBody  BiletDTO bill) {
        Random number = new Random();
        String id = String.valueOf(number.nextInt(100));
        myMap.put(id, convert(bill));
        return ResponseEntity.ok(id);
    }

    private BiletDTO convert(Bill bilet) {
        BiletDTO biletDTO = new BiletDTO();
        biletDTO.date = bilet.date;
        biletDTO.osoba = convert(bilet.osoba);
        return biletDTO;
    }

    private OsobaDTO convert (Osoba osoba) {
        OsobaDTO osobaDTO = new OsobaDTO();
        osobaDTO.imie = osoba.imie;
        osobaDTO.wiek = osoba.wiek;
        return osobaDTO;
    }

    private Bill convert(BiletDTO bilet) {
        Bill bill = new Bill();
        bill.date = bilet.date;
        bill.osoba = convert(bilet.osoba);
        return bill;
    }

    private Osoba convert (OsobaDTO osobaDto){
        Osoba osoba = new Osoba();
        osoba.imie = osobaDto.imie;
        osoba.wiek = osobaDto.wiek;
        return osoba;
    }



}
