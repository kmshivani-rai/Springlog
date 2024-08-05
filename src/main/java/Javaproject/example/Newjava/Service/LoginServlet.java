package Javaproject.example.Newjava.Service;
import Javaproject.example.Newjava.model.User;
import Javaproject.example.Newjava.repo.UserloginRepo;
import jakarta.servlet.annotation.WebServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    @Service
    public class LoginServlet {

        @Autowired
        private UserloginRepo userloginRepo;

        public void save(Map<String,String> paramMap)
        {
            String email=paramMap.get("email");
            String password=paramMap.get("password");

            List<User> userList=userloginRepo.findAll();

            for(int i=0;i<userList.size();i++)
            {
                User model=userList.get(i);
                if(model.getEmail()!=null){
                if(model.getEmail().equals(email))
                {
                    return;
                }
             }
            }

            User user=new User(email,password);

            userloginRepo.save(user);
        }
    }



