package Javaproject.example.Newjava.Birthday;

public class Strbase {
    public static void main(String[] args) {
        String str = "shi.shivani.rai.km.sharma"; // output :sharma.km.rai.shivani.shi.
        String [] st= str.split("\\.");

        for(int i= st.length-1; i>=0; i--){
            System.out.print(st[i]+".");
        }
       /* String str = "shi.shivani.rai.km.sharma"; // output :sharma.km.rai.shivani.shi.
        String [] st= str.split(" ");

        for(int i= st.length-1; i>=0; i--){
            System.out.print(st[i]+" ");
        }*/
        //	System.out.println("Hello World");
    }
}
