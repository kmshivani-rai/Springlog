package Javaproject.example.Newjava.repo;

import Javaproject.example.Newjava.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserloginRepo extends JpaRepository<User, Integer> {
    List<User> findAllByEmailAndPassword(String email, String password);

    List<User> findAll();
}
