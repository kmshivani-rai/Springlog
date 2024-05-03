package Javaproject.example.Newjava.controller;

import Javaproject.example.Newjava.Service.Servicelayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/")
public class RestControlleNew {

    @Autowired
    Servicelayer servicelayer;

    @RequestMapping("/restdemoapi")
    public ResponseEntity<?> getrestdemoapi(){
       return new ResponseEntity<>(servicelayer.restMth(), HttpStatus.OK);
    }

    @RequestMapping("/mvc/restinfo")
    public  ResponseEntity<?> getrestdemoinfo(){
        return new ResponseEntity<>(servicelayer.stInform(),HttpStatus.OK);
    }
     /*public List<Course> getcourse(){
        return "";
     }*/

}
