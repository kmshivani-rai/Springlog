package Javaproject.example.Newjava;

import Javaproject.example.Newjava.Birthday.BirthDayc;
import Javaproject.example.Newjava.DAO.Daolayer;
import Javaproject.example.Newjava.Service.Servicelayer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.awt.*;
import javax.swing.*;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.TreeSet;


@SpringBootApplication
public class NewjavaApplication {

	public static void main(String[] args) throws UnsupportedEncodingException {
		SpringApplication.run(NewjavaApplication.class, args);
		SwingUtilities.invokeLater(() -> {
			if (GraphicsEnvironment.isHeadless()) {
				// Handle the headless mode (e.g., provide a console interface or run different code)
				System.out.println("Running in headless mode. No graphical interface will be displayed.");
			} else {
				// Proceed with GUI as normal
				new BirthDayc().setVisible(true);
			}
		});
		System.setProperty("java.awt.headless", "true");



		Servicelayer servicelayer = new Servicelayer();
		servicelayer.getDaoObject();

		
		final String text = " java base this is a java  new feature";
	     String encodetext =	Base64.getEncoder().encodeToString(text.getBytes("UTF-8"));
		//System.out.println("Encode value =  " + encodetext);

		 byte[] decodetext = Base64.getDecoder().decode(encodetext);
		 String ddncodetext = new String(decodetext, "UTF-8");
		//System.out.println("Decode this code encode value = " + ddncodetext);

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(8);
		treeSet.add(8);

		 System.out.println("tree set "+ treeSet);
		 treeSet.remove(2);
		 System.out.println("TREESET REMOVE 2------ "+ treeSet);
		System.out.println(treeSet.contains(2));

		// gettting the first and last element
		System.out.println("first  element " + treeSet.first());
		System.out.println("first  element " + treeSet.last());
		System.out.println("Hello Im here");



		Daolayer daolayer = new Daolayer();
		daolayer.setName("shivani");

	System.out.println("hii gagagagagagag"+daolayer.getName()+"");//+ daolayer.getAcname()+""+ daolayer.getSurname()

	}

}
