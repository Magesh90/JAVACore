package javacore;
import java.util.HashSet;
import java.util.Set;


public class SetCollection {

	public static void main(String[] args) {
		String[] setsToCompare=new String[]{"1,2,3","4,6","1,2,3"};
		int duplicateSetCount=0;
		int unizueSets=0;
		Set<HashSet<Integer>> finalSet=new HashSet<HashSet<Integer>>();
		
for (int i = 0; i < setsToCompare.length; i++) {
	Integer[] addnumbers=new Integer[setsToCompare[i].split(",").length];
	HashSet<Integer> numbers=new HashSet<Integer>();
	for (int j = 0; j < setsToCompare[i].split(",").length; j++) {
		
		numbers.add(Integer.parseInt(setsToCompare[i].split(",")[j]));
		addnumbers[j]=Integer.parseInt(setsToCompare[i].split(",")[j]);
	}
	if(finalSet.add(numbers)){
		++unizueSets;
	}
	else 
		++duplicateSetCount;
}
System.out.println(finalSet.toString());
System.out.println("Unique Sets = "+unizueSets);
System.out.println("Duplicate Set Count = "+duplicateSetCount);
/*Set<Integer> firstAddition = new HashSet<Integer>();
for (int i = 0; i < 2; i++) {
	firstAddition.add(Integer.parseInt(s1.split(",")[i]));
}
for(Integer value:firstAddition)
System.out.println(value);
	}*/

}
	
}