package Javaproject.example.Newjava.Service;

import Javaproject.example.Newjava.model.Registerm;
import Javaproject.example.Newjava.repo.Registerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RegisterService {
    @Autowired
    private Registerrepo registerrepo;

    public void saveregister(Map<String, String> paramMap){
        String email = paramMap.get("email");
        String name = paramMap.get("name");
        String phone = paramMap.get("phone");
        String address = paramMap.get("address");
        String pincode = paramMap.get("pincode");
        String city = paramMap.get("city");
        String country = paramMap.get("country");


        Registerm regist = new Registerm();

        regist.setEmail(email);
        regist.setName(name);
        regist.setPhone(phone);
        regist.setAddress(address);
        regist.setCity(city);
        regist.setCountry(country);
        regist.setPincode(pincode);

        registerrepo.save(regist);
        return ;

    }


}
