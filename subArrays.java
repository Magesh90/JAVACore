package javacore;
import java.util.ArrayList;
import java.util.Arrays;


public class subArrays {
	
	public void generateSubArrays(int[] mainArray){
		int[] subArrays;
		int[] remodelSubArrays;
		remodelSubArrays=new int[15];
		ArrayList<int[]> ListofSubArrays=new ArrayList<int[]>();
		//1,2,3 is the main array
		int a[]=new int[12];
		int[] r=new int[10];
		int pointer=0;
		int k=0;
		ArrayList<int[]> al=new ArrayList<int[]>();
		//{1},{1,2},{1,2,3}.{2,3},{2},{3} are the subArrays
		for (int i = 0; i < mainArray.length; i++) {
			//subArrays=new int[]{mainArray[i]};
			//ListofSubArrays.add(subArrays);
			/*remodelSubArrays=new int[mainArray.length-k];
			remodelSubArrays[i]=mainArray[i];*/
			for (int j = i+1; j <= mainArray.length; j++) {
				subArrays=Arrays.copyOfRange(mainArray, i, j);
				//remodelSubArrays[j]=mainArray[j];
				ListofSubArrays.add(subArrays);
				//pointer=j;
			}
			//k++;
			//al.add(remodelSubArrays);
		}
		for (int i = 0; i < ListofSubArrays.size(); i++) {
			StringBuilder sb=new StringBuilder();
			for (int j = 0; j < ListofSubArrays.get(i).length; j++) {
				sb.append(ListofSubArrays.get(i)[j]);
			}
			System.out.println(sb);
		}
	}

	public static void main(String[] args) {
int[] mainArray=new int[]{2,3,4,5};
int[] subArray=Arrays.copyOfRange(mainArray, 1, 3);
for (int i = 0; i < subArray.length; i++) {
	//System.out.println(subArray[i]);
}
subArrays obj=new subArrays();obj.generateSubArrays(mainArray);
	}

}
