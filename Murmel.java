/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.01.2025
 * @author 
 */

public class Murmel {
  
  // Anfang Attribute
  int xPos;
  int yPos;
  boolean imSpiel;
  // Ende Attribute
  
  public Murmel() {}

  // Anfang Methoden
  public void bewegen(int x, int y) {
    this.xPos = x;
    this.yPos = y;
  }
  public void setxPos(int xPos) {
      this.xPos = xPos;
  }
  public void setyPos(int yPos) {
      this.yPos = yPos;
  }
  public int getxPos() {
      return xPos;
  }
  public int getyPos() {
      return yPos;
  }
  public void setImSpiel(boolean imSpiel) {
      this.imSpiel = imSpiel;
  }
  public boolean getImSpiel(){
    return imSpiel;
  }
  // Ende Methoden
} // end of Murmel
