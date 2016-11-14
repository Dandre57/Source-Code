// Address Book
import java.util.*;

public class AddressBook
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);

		File file = new File("AddressBook.txt");
		file.createNewFile();

		FileWriter writer = new FileWriter(file);

		String userName, contactName, contactNumber;

		System.out.print("Insert your name: ");
		userName = nextln();

		str = String.format("\n%s Address Book", userName);

		System.out.println("\nInput your contact's name: ");
		contactName = nextln();

		System.out.println("Input your contact's phone number: ");
		contactNumber = nextln();
		contact = String.format("Name %s\t Phone Number %s\t ", contactName, contactNumber);

		writer.write(str);
		writer.write(contact);
		
	} // End of main method

} // End of class
