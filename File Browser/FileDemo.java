package assignments.io;
import java.io.*;import java.util.Date;
//how to open an file and get it its properties
// file is a class in java in IO package
public class FileDemo
{
	public static void main(String args[])
	{
		File f=new File ("D:\\Students\\Pramod\\test.text");
		System.out.println("Name =" +f.getName());
		System.out.println("Parent =" +f.getParent());
		System.out.println("Path =" +f.getPath());
		System.out.println("can Read =" +f.canRead());
		System.out.println("can Write =" +f.canWrite());
		System.out.println("is File =" +f.isFile());
		System.out.println("is Directory =" +f.isDirectory());
		System.out.println("length =" +f.length());
		System.out.println("exists =" +f.exists());
		System.out.println("lastModified =" + f.lastModified()); //julian number
		System.out.println("lastModified =" + new Date(f.lastModified()));    
		//lastModified will return a julian number instead of date 
		//and same will be converted into regular format by date class
//		String s[]=f.list();
//		for(int i=0;i<s.lenght;i++)
//		{
//			System.out.println(s[i]);
//		}
		System.out.println("Rename to =" +f.renameTo(new File("test2.text")));
		//this will rename the file in the same directory
		//if we give another path it will rename and also move the file to that directory
	}
};
//run as >   java assignments.io.IDDemo1