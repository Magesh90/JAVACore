package javacore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class arrayListDemo {
	int nooflines;
	String[] userInput;
	ArrayList<ArrayList<Integer>> completelistofNumbers;
public void getInput()
{
	System.out.println("Enter the number of lines");
	Scanner sc=new Scanner(System.in);
	nooflines=sc.nextInt();
	userInput=new String[nooflines];
	System.out.println("Enter space seperated numbers in "+nooflines+" lines");
	for (int i = 0; i < nooflines; i++) {
		sc.nextLine();
		System.out.println("Now");
		String str=sc.nextLine();
		userInput[i]=str;
	}
	System.out.println(userInput.toString());
	sc.close();
}

public void getittoList(){
	completelistofNumbers=new ArrayList<ArrayList<Integer>>();
	for (int i = 0; i < userInput.length; i++) {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		String[] numbersinArray= userInput[i].split(" ");
		Integer[] ArrayNumbers=new Integer[userInput.length];
		for (int j = 0; j < numbersinArray.length; j++) {
			ArrayNumbers[j]=(Integer.parseInt(numbersinArray[j]));
			numbers.add(ArrayNumbers[j]);
			System.out.println(numbers.toString());
		}
		completelistofNumbers.add(numbers);
	}
	System.out.println(completelistofNumbers.toString());
}
	public static void main(String[] args) {
		arrayListDemo obj=new arrayListDemo();
		//obj.getInput();obj.getittoList(); 
		//int[] to ArrayList<Integer> will not work since primitive is not
		//meant to handled by Arraylist(colllections)
		//change int to Integer and then cast it to ArrayList
		//whereas List will work for primitive datatype 
int[] array=new int[]{1,2,3};
List<int[]> arraytoList=Arrays.asList(array);
System.out.println("size of the list "+arraytoList.size());
for (int i = 0; i < arraytoList.size(); i++) {
	for (int j = 0; j < arraytoList.get(i).length; j++) {
		System.out.println(arraytoList.get(i)[j]);
	}
	//System.out.println(arraytoList.get(i));
	//List to Array
	//convert list<int> to List<Integer>
	Integer[] arrayforconversion = new Integer[array.length];
	for (int j = 0; j < arraytoList.size(); j++) {
		System.out.println(arraytoList.get(j).length);
		
		for (int j2 = 0; j2 < arraytoList.get(j).length; j2++) {
			arrayforconversion[j2]=arraytoList.get(i)[j2];
		}
	}
	ArrayList<Integer> IntegerList=new ArrayList<Integer>(Arrays.asList(arrayforconversion));
	System.out.println(IntegerList.size());
	/*Integer[] arrayfromlist=(Integer[]) arraytoList.toArray();
	System.out.println(arrayfromlist.length);*/
}

	}

}
