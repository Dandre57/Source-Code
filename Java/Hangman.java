import java.util.Scanner;
import java.util.Random;

public class Hangman
{
  private String[] array = {"batman", "flash", "superman", "cyborg", 
                            "wonderwoman", "aquaman", "ironman", "hulk", 
                            "thor", "wolverine", "spiderman"}
  private int mistakes = 6;
  private String hero;
  private int numHeroes;
  //private boolean answer;
  
  // Constructor
  public Hangman()
  {
    Scanner scan = new Scanner(System.in);
    
    chooseHero();
    String answer = getHero();
    char temp;
    char[] guess;
      
    System.out.println("Welcome to Hangman! \n");
    System.out.println("This version only contains popular heroes from \n" +
    "the Marvel and D.C. Universes!");

    System.out.print("Enter a letter: ");
    /*
    temp = scan.nextln();
    guess = temp.toCharArray();
    */
    guess = scan.nextln();
    if(guess.length > 1)
      System.out.println("Sorry, Input is to long.");
    
    
  }
  
  public void choosenHero()
  {
    Random rand = new Random();
    
    numHeroes = array.length - 1;
    hero = array[rand.nextInt(numHeroes)];
  }
  
  public String getHero()
  {
    return hero;
  }

  public void mistakeMade()
  {
    mistakes -= 1;
    System.out.println("Sorry, You've the letter you choose is not found.");
    String str = String.format("You have %d chances left.", getMistakes());
    System.out.println(str);
    
    //bool = false;
  }
  
  public int getMistakes()
  {
    return mistakes;
  }
  
  /*
  public boolean getBool()
  {
    return bool;
  }
  */
  
  // Takes users guess as parameter
  // Method to check if the letter the user input is in the choosenHero
  public void letterCheck(String g)
  {
    for(int i = 0; i < array.length; i++)
    {
      if(g == answer[i])
      {
        //g = answer[i];
      }
      else if(g != answer[i])
      {
        mistakeMade();
      }
    }// End of for loop
    
  }// End of letterCheck method
  
  public static void main(String[] args)
  {
    new Hangman();
  }

}
