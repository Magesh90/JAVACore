package javacore;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Challenge {
private static int B;
private static int H;

static{
	B=4;H=8;
}

int a;
int b;
int n;
int[] output ;
public Challenge(int a, int b, int n) {
	super();
	this.a = a;
	this.b = b;
	this.n = n;
	this.output=new int[n];
}
public void takeChallenge()
{
	int x=a+b;
	int y=B*H;
	System.out.println("value of B*H="+y);
for (int i = 1; i <=n; i++) {
	output[i-1]=x;
	x=(int) (x+(Math.pow(2, i))*b);
	
}
if (output.length>0) {
	for(int i=0;i<output.length;i++){
		System.out.println(output[i]);	
	}
	
	
}
else System.out.println(x);
}

public static void main(String[] args) throws IOException{
	
	//scanner
	Scanner scanner=new Scanner(System.in);
	int d=scanner.nextInt();int f=scanner.nextInt();
	System.out.println(d +" and "+f);
	
	B=3;
	System.out.println("inside main()-- b's value is "+B);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input;
	int[] inputarray=new int[3];
	try{
		int x=0;
		
		do{
			inputarray[x]=Integer.parseInt(br.readLine());x++;
		}while(x<inputarray.length);
		System.out.println("Over");
	/*while((input=br.readLine())!=null){
		inputarray[x]=Integer.parseInt(input);
		++x;
	}*/
	}
	catch(IOException e){
		throw new IOException();
	}
	Challenge challenge=new Challenge(inputarray[0],inputarray[1],inputarray[2]);
	challenge.takeChallenge();
}
}
