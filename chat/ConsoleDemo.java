package assignments.io;
import java.io.Console;


public class ConsoleDemo
{
	
	public static void main(String arg[])
	{
		Console console=System.console();
		String username = console.readLine("Enter Username : ");
		char[] password=console.readPassword("Enter Password : ");
		if(username.equals("sanjay") && (new String(password)).equals("mikado"))
			console.printf("login successful");
		else
			console.printf("login failed");
	}
};



//run as > java assignments.io.ConsoleDemo.java