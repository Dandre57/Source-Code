import java.util.Scanner;
import java.util.Random;

public class Hangman
{
  private String[] array = {"batman", "flash", "superman", "cyborg", 
                            "wonderwoman" ,"aquaman", "ironman", "hulk", 
                            "thor", "wolverine", "spiderman"}
  private int numHeroes;
  private String hero;
  private int mistakes = 6;
  
  
  public Hangman()
  {
    Scanner scan = new Scanner(System.in);
    
    chooseHero();
    String word = getHero();
    char[] guess;
      
    System.out.println("Welcome to Hangman! \n");
    System.out.println("This version only contain popular heroes!");
    System.out.print("Take your guess: ");
    
    //guess = 
  }
  
  public void choosenHero()
  {
    Random rand = new Random();
    
    numHeroes = array.length - 1;
    hero = array[rand.nextInt(numHeroes)];
  }
  
  public void mistakes()
  {
    
  }
  
  public static void main(String[] args)
  {
    new Hangman();
  }

}
