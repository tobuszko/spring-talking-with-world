package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.awt.image.ByteArrayImageSource;

import javax.activation.MimeType;

@Controller
@RequestMapping("/my")
public class myCOntroller {


    //127.0.0.1
    @GetMapping
    public ResponseEntity get() {
        ResponseEntity entity = new ResponseEntity("Hello World", HttpStatus.OK);


        return entity;

    }

    //127.0.0.1/json
    @RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getJson() {
        String json = "{\n" +
                "  \"imie\" : \"Adam\",\n" +
                "  \"szkola\" : {\n" +
                "    \"nazwa\" : \"SZPnr11\",\n" +
                "    \"adres\" : \"blablabla\"\n" +
                "  },\n" +
                "  \n" +
                "  \"ocena\" : [5, 5, 2]\n" +
                "}";
        ResponseEntity entity = new ResponseEntity(json, HttpStatus.OK);

        return entity;
    }



    }
