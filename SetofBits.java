package javacore;import java.util.ArrayList;

import java.util.BitSet;
import java.util.List;
import java.util.Vector;


public class SetofBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BitSet bitset=new BitSet(13);
bitset.set(2);
bitset.set(2,6);
System.out.println(bitset.get(2,5));
System.out.println(bitset.toString());
Vector vector=new Vector();
Integer in=new Integer(5);
vector.add(5);
vector.addElement(new Integer(5));
vector.add("hello");
vector.add(new Integer(23));
System.out.println(vector.get(0));
vector.set(2,"modified");
Object[] array=vector.toArray();
List listofitems=new ArrayList();
listofitems.add('c');
listofitems.add(12);
vector.addAll(listofitems);
List checkString=new ArrayList<String>();
checkString.add("modified");
if(vector.containsAll(listofitems))
{
	System.out.println("ContainsAll() Works!!");
}
if(vector.containsAll(checkString))
{
	System.out.println("ContainsAllforString() Works!!");
}
if(vector.contains(in)){
	System.out.println("index() "+vector.indexOf(in));
}
for (int i = 0; i < vector.size(); i++) {
	System.out.println(vector.get(i));
}
	}

}
