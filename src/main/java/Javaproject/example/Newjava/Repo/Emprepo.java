package Javaproject.example.Newjava.Repo;

import Javaproject.example.Newjava.Entity.Empoyee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface Emprepo extends JpaRepository<Empoyee, Integer> {
    Optional<Empoyee> findByEmailAndPassword(String  email, String password);




}
