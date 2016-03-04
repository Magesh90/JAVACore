package javacore;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ReadFromFile {
public static void main(String[] args) throws IOException{
	FileWriter fw=new FileWriter("fos1.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	String toWrite="I am creating this file for demonstrating the new File creadtion";
	bw.write(toWrite);
	bw.close();
	/*FileOutputStream fos= new FileOutputStream("fos.txt");
	String x="reading from the txt file as the txt file has more line";
	
	
	byte[] bytes=x.getBytes();
	fos.write(bytes);*/
	String y;
	System.out.println("Read from file");
	FileReader fr=new FileReader("fos.txt");
	BufferedReader br=new BufferedReader(fr);
	while((y=br.readLine())!=null){
		System.out.println(y);
	}
	FileInputStream fis=new FileInputStream("fos.txt");
	byte[] reader=new byte[100];
	while(fis.read(reader)!=-1){
		System.out.println(new String(reader));
	}
	Scanner sc=new Scanner(System.in);
	/*StringBuilder fileContents=new StringBuilder();
	fileContents.append(sc.nextLine());
	while(fileContents){
		fileContents.append(sc.nextLine());
	}
	System.out.println(fileContents);*/
	//fos.close();
}
}
