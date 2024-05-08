package Javaproject.example.Newjava.Birthday;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicatechar {
  public static void main(String[] args) {
            Scanner cs = new Scanner(System.in);
            String str = cs.nextLine();
            if(str==null){
                System.out.println("NULL");
                return;
            }  if(str.isEmpty()){
                System.out.println("empty stringg");
            }
            if(str.length()==1){
                System.out.println("one syting ");
            }
            char[] charr = str.toCharArray();
            Map<Character , Integer> dupchr = new HashMap<>();

            for(Character ch : charr){
                if(Character.isAlphabetic(ch)){
                    if(dupchr.containsKey(ch)){
                        dupchr.put(ch, dupchr.get(ch)+1);
                    }else{
                        dupchr.put(ch, 1);
                    }
                }

            }
      System.out.println(dupchr);
      // for(Map.Entry<Character, Integer> entry : entrySet){
      // System.out.println(entry.getValue() + " - " + entry.getKey());
      // }
            // for(int i=0; i<ch.length; i++){
            //   System.out.print(ch[i]+",");     }
            //

    /*   count occurrences
     Character ch : str.toCharArray()){
          if(ch=='v'|| ch=='i'){
              count++;
          } String str = "shivani";
          int count=0;
          for(
      } System.out.println(count);*/

  }
    }
