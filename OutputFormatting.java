package javacore;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class OutputFormatting {

	 public static void main(String[] args) {
		 int x=2;int y=4;
		 System.out.println(Math.pow(x, y));
         Scanner sc=new Scanner(System.in);
         String[] s1=new String[1];
         System.out.println("================================");
         for(int i=0;i<1;i++)
         {
             s1[i]=(String) sc.nextLine();
         }
         StringBuilder stringbuilder=new StringBuilder();
         StringBuilder digitbuilder=new StringBuilder();
         for (int i = 0; i < s1.length; i++) {
        	 String substitute=s1[i];
        	 //if(substitute.matches())
        	 
        	 Matcher charmatch=Pattern.compile("[a-zA-Z]").matcher(s1[i]);
        	 Matcher digitmatch=Pattern.compile("[0-9]").matcher(s1[i]);
        	 while(charmatch.find()){
        		 stringbuilder.append(charmatch.group());
        		 }
        	 System.out.println(stringbuilder);
        	 while(digitmatch.find()){
        		 digitbuilder.append(digitmatch.group());
        	 }
        	 System.out.println(digitbuilder);
			//System.out.println(s1[i]);
		}
         System.out.println("================================");

 }
}
