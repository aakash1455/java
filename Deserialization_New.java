package Tester;

import java.io.*;


public class Deserialization_New {

	public static void main(String[] args) {

		String filename="demo.txt";
		
		Demo demo=null;
		try {
			InputStream fin=new FileInputStream(filename);
			InputStream buffer=new BufferedInputStream(fin);
			ObjectInput in=new  ObjectInputStream(buffer);
			
			demo = (Demo)in.readObject();
			
			fin.close();
			buffer.close();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ID : "+demo.id);
		System.out.println("Name : "+demo.desc);

	}

}
