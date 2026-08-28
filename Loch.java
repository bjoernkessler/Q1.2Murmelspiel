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
  private static int spielFeldGroesse = 36;
  private static int xPosition;
  private static int yPosition;
  private static boolean imLoch;
  // Ende Attribute
  
  // Anfang Methoden
  public static void setPosition() {
    xPosition = (int) (Math.random() * spielFeldGroesse);
    yPosition = (int) (Math.random() * spielFeldGroesse);
  }
  
  public static int[] getPosition() {
    return new int[] {xPosition, yPosition};
  }

  public static boolean getImLoch() {
      return imLoch;
  }

  public static void setImLoch(boolean imLoch) {
      Loch.imLoch = imLoch;
  }
    // Ende Methoden
} // end of Loch
