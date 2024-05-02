package Javaproject.example.Newjava.Service;


import Javaproject.example.Newjava.DAO.Daolayer;
import Javaproject.example.Newjava.Entity.Empoyee;
import Javaproject.example.Newjava.Repo.Emprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// business logic layer
@Service
public class Servicelayer {

    @Autowired
    private Emprepo emprepoy;// constructor  auto

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



    }
