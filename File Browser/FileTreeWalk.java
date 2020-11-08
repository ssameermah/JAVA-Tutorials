package assignments.nio;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

class MyFileVisitor extends SimpleFileVisitor<Path>
{
	@Override
	public FileVisitResult visitFile(Path path,BasicFileAttributes fileAttributes)
	{
		System.out.println("About to visit File: "+path.getFileName());
		System.out.println("File Size = "+fileAttributes.size());
		Path newPath = Paths.get("D:\\Students\\Pramod\\ConsoleDemo.java");
		if(path.equals(newPath))
			return FileVisitResult.SKIP_SIBLINGS;
		else
			return FileVisitResult.CONTINUE;
	}
	@Override
	public FileVisitResult preVisitDirectory(Path path,BasicFileAttributes dirAttributes)
	{
		System.out.println("About to visit directory: "+path.getFileName());
		System.out.println("Directory creation Time = "+dirAttributes.creationTime());
		Path newPath = Paths.get("D:\\Students\\Pramod\\assignments");
		if(newPath.equals(path))
			return FileVisitResult.SKIP_SUBTREE;
		else
			return FileVisitResult.CONTINUE;
	}
	@Override
	public FileVisitResult postVisitDirectory(Path path,IOException e)
	{
		System.out.println("Finished visiting directory: "+path.getFileName());
		return FileVisitResult.CONTINUE;
	}
	@Override
	public FileVisitResult visitFileFailed(Path path,IOException e)
	{
		System.out.println("File visit Failed due to following Exception: "+e);
		return FileVisitResult.CONTINUE;
	}
};
	
	
	
public class FileTreeWalk
{
	public static void main(String arg[])
	{
		try
		{
			Path path = Paths.get("D:\\Students\\Pramod");
			Files.walkFileTree(path,new MyFileVisitor());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
};



//run as > java assignments.io.PathDemo
//check with one by one all cases