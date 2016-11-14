// Address Book
import java.util.*;
import java.io.*;

public class AddressBook
{
	private Scanner scan = null;
	
	public AddressBook
	{
		try
		{
			Scanner scan = new Scanner(System.in);

			File file = new File("AddressBook.txt");
			file.createNewFile();

			FileWriter writer = new FileWriter(file);

			//String userName;
			String contactName, contactNumber;
			
			//System.out.print("Insert your name: ");
			//userName = nextln();

			System.out.println("\nInput your contact's name: ");
			contactName = scan.nextln();

			System.out.println("Input your contact's phone number: ");
			contactNumber = scan.nextln();
		
			//str = String.format("\n%s Address Book", userName);
			contact = String.format("Name %s\t Phone Number %s\t ", contactName, contactNumber);

			//writer.write();
			writer.write(contact);
			
		} // End of try statement
		catch(Exception e)
		{
			System.out.println("An error has occured");
		} 
	} // End of constructor
	
	public static void main(String[] args) throws IOException
	{
		new AddressBook();
		
		scan = new Scanner(System.in);
		String answer;
		
		System.out.println("Would you like to input another contact?");
		answer = nextln();
		
		while(answer.toLowerCase() == "yes")
		{
			System.out.println("Would you like to input another contact?");
			answer = nextln();
			new AddressBook();
		}
	} // End of main method

} // End of class
