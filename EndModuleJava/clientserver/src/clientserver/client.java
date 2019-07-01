package clientserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			Socket sender=new Socket(InetAddress.getByName("localhost"),3000);
			DataOutputStream outgoing=new DataOutputStream(sender.getOutputStream());
			String d=sc.nextLine();
			 outgoing.writeUTF(d);
			 DataInputStream i=new DataInputStream(sender.getInputStream());
			 String ii=i.readUTF();
			 System.out.println(ii);
			
		}catch(UnknownHostException e)
		{
			System.out.println("unknown exception");
			e.printStackTrace();
		}catch(IOException e)
		{
			System.out.println("ioexception");
			e.printStackTrace();
		}

	}

}
