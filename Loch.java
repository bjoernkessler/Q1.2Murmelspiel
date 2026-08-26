/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.01.2025
 * @author 
 */

public class Loch {
  
  // Anfang Attribute
  private static int Position;
  // Ende Attribute
  
  // Anfang Methoden
  public static void setPosition() {
    Position = (int) (Math.random() * 32);
  }
  
  public static int getPosition() {
    return Position;
  }
  // Ende Methoden
} // end of Loch
