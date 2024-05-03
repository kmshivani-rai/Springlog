package Javaproject.example.Newjava.Repo;

import Javaproject.example.Newjava.Entity.Studentinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Studentinfo, Integer> {

}
