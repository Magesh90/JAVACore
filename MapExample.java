package javacore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class MapExample {

	public static void main(String[] args) {
		
		HashMap<String,String> example=new HashMap<String,String>();
		List<HashMap> sample=new ArrayList<HashMap>();
		sample.add(example);
		for (int i = 0; i < sample.size(); i++) {
			HashMap<String,String> dummy=sample.get(i);
		}
		  //System.out.println("Enter the number of users");
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	       Map<String,Integer> directory=new HashMap<String,Integer>();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         in.nextLine();
	          directory.put(name,phone);
	      }
	       //System.out.println("Enter the User whom you need to find");
	       Set<String> UserNames=new HashSet<String>();
	       UserNames=directory.keySet();
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	          if(UserNames.contains(s)){
	              System.out.println(s+" = " +directory.get(s));
	          }
	          else
	              System.out.println("User not exists");
	      }
	   }

	
}
