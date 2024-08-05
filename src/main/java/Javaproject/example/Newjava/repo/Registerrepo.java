package Javaproject.example.Newjava.repo;

import Javaproject.example.Newjava.model.Registerm;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface Registerrepo extends JpaRepository<Registerm, Integer> {
    Optional<Registerm> findByEmail(String email);



}
