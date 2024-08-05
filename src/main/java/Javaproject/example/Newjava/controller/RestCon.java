package Javaproject.example.Newjava.controller;

import Javaproject.example.Newjava.Service.LoginServlet;
import Javaproject.example.Newjava.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;

@RestController(value = "/")
public class RestCon {
    @Autowired
    private LoginServlet loginServlet;

    @PostMapping(value = "/saveData")
    public void   save(@RequestBody Map<String, String> paramMap)
    {

      loginServlet.save(paramMap);

        //return new RedirectView("/formPage.jsp");
    }



    @Autowired
    private RegisterService registerService ;
    @PostMapping(value = "/rgtrsavedata")
    public  void  registersavedata(@RequestBody Map<String, String> paramMap)
    {
        registerService.saveregister(paramMap);
    }

}
