import java.util.Scanner;

public class VowelCounter
{
  public static void main(String[] args)
  {
    String input;
    String conversion;
    char c[];
    int vowel1 = 0;
    int vowel2 = 0;
    int vowel3 = 0;
    int vowel4 = 0;
    int vowel5 = 0;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a word: ");
    input = sc.nextLine();
    conversion = input.toLowerCase();
    System.out.println("");
    
    c = conversion.toCharArray();
    
    for(int i = 0; i < conversion.length(); i++)
    {
      if(c[i] == 'a')
        vowel1++;
      
      else if(c[i] == 'e')
        vowel2++;
      
      else if(c[i] == 'i')
        vowel3++;
      
      else if(c[i] == 'o')
        vowel4++;
      
      else if(c[i] == 'u')
        vowel5++;      
    }
    
    String str = String.format("A: %d\n E: %d\n I: %d\n O: %d\n U: %d\n", vowel1, vowel2, 
                               vowel3, vowel4, vowel5);
    System.out.println(str);
  }
}
