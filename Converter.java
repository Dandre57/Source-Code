/**
 * Made by D'Andre Campbell
 */ 

public class Converter
{
  private double jam;   // Holds conversion of US to Jamaican currensy
  private double euros; // Holds conversion of US to European currensy
  private double pesos; // Holds conversion of US to Mexican currensy
  private double yen;   // Holds conversion of US to Japanese currensy
  private double yuan;  // Holds conversion of US to Chinese currensy
  
  /**
   * Converts US dollar to Jamaican dollar
   */ 
  public void UStoJam(double money)
  {
    money = jam;
    jam *= 126.82;
  }
  
  /**
   * Returns value of jam
   */ 
  public double getJam()
  {
    return jam;
  }
  
  /**
   * Converts US dollar to European dollar
   */ 
  public void UStoEuro(double money)
  {
    money = euros;
    euros *= .9;
  }
  
  /**
   * Returns value of euros
   */ 
  public double getEuros()
  {
    return euros;
  }
  
  /**
   * Converts US dollar to Japanese dollar
   */ 
  public void UStoJapan(double money)
  {
    money = yen;
    yen *= 101.57;
  }
  
  /**
   * Returns value of yen
   */ 
  public double getYen()
  {
    return yen;
  }
  
  /**
   * Converts US dollar to Chinese dollar
   */ 
  public void UStoChina(double money)
  {
    money = yuan;
    yuan *= 6.68;
  }
  
  /**
   * Returns value of yuan
   */ 
  public double getYuan()
  {
    return yuan;
  }
  
  /**
   * Converts US dollar to Mexican dollar
   */ 
  public void UStoMexico(double money)
  {
    money = pesos;
    pesos *= 18.74;
  }
  
  /**
   * Returns value of pesos
   */ 
  public double getPesos()
  {
    return pesos;
  }
}