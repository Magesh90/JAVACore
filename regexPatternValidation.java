package javacore;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class regexPatternValidation {

	private boolean regexvalidator(String expression){
		try{
			Pattern.compile(expression);
		}
		catch(PatternSyntaxException exception){
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter your Regex");
		Scanner sc=new Scanner(System.in);
		String expression=sc.nextLine();
if(new regexPatternValidation().regexvalidator(expression)) 
	System.out.println("Valid Regex");
else System.out.println("Invalid Regex"); 
	}

}
