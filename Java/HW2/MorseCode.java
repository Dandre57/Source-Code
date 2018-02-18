import java.util.Scanner;

public class MorseCode 
{

	private char[] characters = {'a', 'b', 'c', 'd', 'e', 'f',
							'g', 'h', 'i', 'j', 'k', 'l', 'm',
							'n', 'o', 'p', 'q', 'r', 's', 't',
							'u', 'v', 'w', 'x', 'y', 'z', '1',
							'2', '3', '4', '5', '6', '7', '8',
							'9', '0', '.', '?', ',', ' '};
	
	private String[] code = {".-", "-...", "-.-.", "-..", ".", "..-.",
							"--.", "....", "..", ".---", "-.-", ".-..", "--",
							"-.", "---", ".--.", "--.-", ".-.", "...", "-",
							"..-", "...-", ".--", "-..-", "-.--", "--..", "-----",
							".----", "..---", "...--", "....-", ".....", "-....", "--...",
							"---..", "----.", "-----", ".-.-.-", "..--..", "--..--", " "};
	
	public MorseCode() 
	{
		Scanner scan = new Scanner(System.in);
		String input;
		
		System.out.print("Input what you would like to convert: ");
		input = scan.nextLine().toLowerCase();
		System.out.println("");
		translate(input);
		
		scan.close();
	}
	
	public void translate(String input)
	{
		char[] c = input.toCharArray();

		for(int i = 0; i < (characters.length - 1); i++)
		{
			if(c[i] == characters[i])
			{
				System.out.println(code[i]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		new MorseCode();
	}
}
