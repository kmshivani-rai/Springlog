package Javaproject.example.Newjava.controller;

import Javaproject.example.Newjava.Service.RegisterService;
import Javaproject.example.Newjava.repo.Registerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// controller layer  used to develop a rest api
@Controller
//
// @RestController  //for rest api
@RequestMapping("/")
public class UserController {

    @RequestMapping("/register")
    // @ResponseBody
    public String Register() {
       //registerService.saveregister
        return "formPage";
    }
    


    @RequestMapping("/digb")
       // @ResponseBody  // Method
        public String helloGFG()
        {  System.err.println("controller is here");
                return "Div1";  }

       // @RequestMapping( value = "/demo", method = {RequestMethod.GET,RequestMethod.POST})


         @RequestMapping("/loginpage")
          public  String getRegister(){

        return "Div1";
           }


    @RequestMapping("/homepageurl")
    public  String getwebster(){
        return "Homepage";

    }

    @RequestMapping("/indexpage")
    public  String getindexpage(){
        return "index";
    }



}
