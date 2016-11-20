import javax.swing.Timer;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Alarm
{
  public static void main(String[] args)
  {
    String music = ".mp3";
    
  }// End of main method
  
  public void playMusic(String song)
  {
    try
    {
      Media media = new Media(song);
      MediaPlayer player = new MediaPlayer(media);
      player.play();
    }
    catch(Exception e)
    {
      System.out.println("Couldn't play the song");
    }
    
  }// End of playMusic method
  
}// End of class
