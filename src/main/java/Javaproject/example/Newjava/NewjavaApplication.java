package Javaproject.example.Newjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.UnsupportedEncodingException;


@SpringBootApplication
public class NewjavaApplication {

	public static void main(String[] args) throws UnsupportedEncodingException {
		SpringApplication.run(NewjavaApplication.class, args);

		System.setProperty("java.awt.headless", "true");

	System.out.println("hii");//+ daolayer.getAcname()+""+ daolayer.getSurname()

	}

}
