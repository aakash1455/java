package clientserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			ServerSocket server=new ServerSocket(3000);
			Socket r=server.accept();
			DataInputStream i=new DataInputStream(r.getInputStream());
			String v=i.readUTF();
			System.out.println("v"+v);
			
			DataOutputStream o=new DataOutputStream(r.getOutputStream());
			String d=sc.nextLine();
			o.writeUTF(d);
		}catch(IOException e)
		{
			System.out.println("ioexception");
			e.printStackTrace();
		}
	}

}
