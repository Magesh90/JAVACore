package javacore;
import java.util.Scanner;


public class subString {
	static int width;
	static String input;
	public static void creatSubStrings(String input,int width){
		for (int i = 0; i <input.length(); i=i+width) {
			System.out.println(input.substring(i, i+width>input.length()?input.length():i+width));
		}
	}
public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	input=scanner.nextLine();
	width=scanner.nextInt();
	creatSubStrings(input,width);
}
}
