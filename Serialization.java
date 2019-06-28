package Tester;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Serialization {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the id");
		int id=sc.nextInt();
		System.out.println("\nEnter the Name");
		
		String desc=sc.next();
	
		Demo obj=new Demo(id,desc);
		
	
		String filename="demo.txt";
		
		
		try {
			OutputStream fout = new FileOutputStream(filename,true);
			 OutputStream buffer = new BufferedOutputStream(fout);
			ObjectOutput out=new ObjectOutputStream(buffer);
			
			out.writeObject(obj);
			out.close();
			fout.close();
			
			System.out.println("Object has been Serialized!!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
