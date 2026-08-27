/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.01.2025
 * @author 
 */

public class Loch {
  
  // Anfang Attribute
  private static int Groesse = 36;
  private static int xPosition;
  private static int yPosition;
  // Ende Attribute
  
  // Anfang Methoden
  public static void setPosition() {
    xPosition = (int) (Math.random() * Groesse);
    yPosition = (int) (Math.random() * Groesse);
  }
  
  public static int[] getPosition() {
    return new int[] {xPosition, yPosition};
  }
  // Ende Methoden
} // end of Loch
