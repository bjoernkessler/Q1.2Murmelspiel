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
  private int spielFeldGroesse = 36;
  private int xPos;
  private int yPos;
  private int imLoch;
  // Ende Attribute
  
  // Anfang Methoden
  public Loch(int xPos, int yPos) {
    this.xPos = xPos;
    this.yPos = yPos;
    this.imLoch = 0;
  }

  public int getxPos() {
    return xPos;
  }
  public int getyPos() {
    return yPos;
  }
  public int getImLoch() {
    return imLoch;
  }
  public void setImLoch(int imLoch) {
    this.imLoch = imLoch;
  }
    // Ende Methoden
} // end of Loch
