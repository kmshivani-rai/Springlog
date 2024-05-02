package Javaproject.example.Newjava.Thread;

public class Threadclass {

    interface Demo {
        default void Show(){
            System.out.println("jiii");
        }
    }
    class Mythread implements Runnable , Demo {
        public   void run(){
            int  a=12;
            int b=13;
            System.out.println(a+b);
            Demo.super.Show();
            try{
                Thread.sleep(1000);// blocked state m chala jaayega thodi der ke liye or phir Runnable me jaa kr running me jaayega phir excute hoga
            } catch(Exception e){}    }
    }
   /* class Main{
        public static void main(String[] args){
            Mythread my1 = new Mythread();
            Thread thread = new Thread(my1);
            Threadmy threadmy = new Threadmy();
            my1.Show();
            threadmy.start();
            thread.start();        //  my.Demo();
        } }*/
    //Thread class
    class Threadmy extends Thread {
        public void run(){
            for(int i =0; i<=5; i++){
                System.out.println("for loop = " + i);        }
        }}



 /*class Main {
     public static void main(String[] args){
         Threadmy thread = new Threadmy();
          thread.start();
     }
 }*/



// Java code for thread creation by extending
// the Thread class
/*class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

// Main Class
public class Main {
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object
				= new MultithreadingDemo();
			object.start();
		}
	}
}*/



}
