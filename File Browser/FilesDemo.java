package assignments.nio;
import java.nio.file.*;
import java.io.IOException;

public class FilesDemo
{
	
	public static void main(String arg[])
	{
		Path path =Paths.get("D:\\students\\pramod\\Sample.txt");

		try
		{
			Files.createFile(path);
			//Files.copy(path,Paths.get("D:\\students\\pramod\\assignments\\Sample1.txt"));
			//Files.move(path,Paths.get("D:\\students\\pramod\\assignments\\io\\Sample2.txt"));
			//Files.delete(path);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
};



//run as > java assignments.io.PathDemo
//check with one by one all cases