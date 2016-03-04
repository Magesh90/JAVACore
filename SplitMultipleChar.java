package javacore;
import java.util.Scanner;


public class SplitMultipleChar {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String splitthis=sc.nextLine();

String[] splitResult=Spliiter(splitthis);
for (int i = 0; i < splitResult.length; i++) {
	System.out.println(splitResult[i]);
}

	}

	private static String[] Spliiter(String splitthis) {
		
		//String[] splitedString=splitthis.split("\\W+");
		
		splitthis=splitthis.replace("\\","\\");
		System.out.println(splitthis.replaceAll("[\\\\.!,@'?\\s]","09"));
		String[] splitedString=splitthis.split("[\\\\.!,@'?\\s]+");
				
		return splitedString;
	}

}
