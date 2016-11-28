import java.util.Scanner;
import java.util.Random;

public class Hangman
{
  private String[] array = {"batman", "flash", "superman", "cyborg", 
                            "wonderwoman", "aquaman", "ironman", "hulk", 
                            "thor", "wolverine", "spiderman"}
  private int mistakes = 6;
  private String hero;
  private int numHeroes
  
  \\ Constructor
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
    temp = scan.nextln();
    if(temp.length > 1)
      System.out.println("Sorry, Input is to long.");
    
    if()


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

  public void mistakes()
  {
    
  }
  
  public static void main(String[] args)
  {
    new Hangman();
  }

}
