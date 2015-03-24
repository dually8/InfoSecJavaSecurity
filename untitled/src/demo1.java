// demo1.java
// creation of the message-digest
// storing the string and digest in file
import java.io.*;
import java.security.*;
class demo1
{
	public static void main(String args[])
	{
		try
		{
			MessageDigest md = MessageDigest.getInstance("SHA");
			String s1 = "we are learning java";
			byte[] array = s1.getBytes();
			md.update(array);
			FileOutputStream fos = new FileOutputStream("demo1test.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.writeObject(md.digest());
			System.out.println("digest ready!");
		}
		catch(Exception e1)
		{ 
			System.out.println(""+e1);
		}
	}
}