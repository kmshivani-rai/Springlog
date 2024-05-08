package Javaproject.example.Newjava.Service;


import Javaproject.example.Newjava.DAO.Daolayer;
import Javaproject.example.Newjava.Entity.Empoyee;
import Javaproject.example.Newjava.Entity.Studentinfo;
import Javaproject.example.Newjava.Repo.Emprepo;
import Javaproject.example.Newjava.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// business logic layer
@Service
public class Servicelayer {

    @Autowired
    private Emprepo emprepoy;// constructor  auto
    @Autowired
    StudentRepo studentinfo;

   /* public Servicelayer(Emprepo emprepoy) {
        this.emprepoy = emprepoy;
    }*/

    public Empoyee register(String name, String email, String password){ /// understanding
        if (email ==null || password==null){
            return null;
        } else {
            Empoyee empoyee = new Empoyee();
            empoyee.setEmail(email);
            empoyee.setName(name);
            empoyee.setPassword(password);
            return  emprepoy.save(empoyee);

        }
    }
/// save data
    public  Empoyee authen(String email, String password){
        return  emprepoy.findByEmailAndPassword(email, password).orElse(null);
    }



  public  Daolayer  restMth(){
      Daolayer deolayer = new Daolayer();
      deolayer.setName("shivanirai");
      deolayer.setEmail("shivaniraishar12@gmail.com");
      deolayer.setPassword("Edu123");
      return  deolayer;

  }


    public void getDaoObject(){
        Daolayer daolayer = new Daolayer();

        daolayer.setName("GaganHere");

        System.err.println("In Dao File: " +daolayer.getName());
    }

     public List<Studentinfo> stInform()
     {

         return studentinfo.findAll();
       /*  Studentinfo studentinfo = new Studentinfo();
         studentinfo.setName1(studentinfo.getName1());
         studentinfo.setLastname(studentinfo.getLastname());
         studentinfo.setAddress(studentinfo.getAddress());
         studentinfo.setFathername(studentinfo.getFathername());
         studentinfo.setMothername(studentinfo.getMothername());
         studentinfo.setEmail(studentinfo.getEmail());
         studentinfo.setSchoolname(studentinfo.getSchoolname());
         studentinfo.setClassname(studentinfo.getClassname());*/

     }



    }
