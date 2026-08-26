/**
 *
 * Das Loch ist ein Objekt, 
 * das eine zufällige Position innerhalb eines quadratischen Bereichs repräsentiert. 
 * Die Größe des Bereichs wird durch die statische Variable "Groesse" bestimmt. 
 * Die Position des Lochs wird durch die statischen Variablen "xPosition" und "yPosition" gespeichert.
 *
 *
 * @version 1.0 vom 16.01.2025
 * @author 
 */

public class Loch {
  
  // Anfang Attribute
  private static int Groesse;
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
