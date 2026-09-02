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
  
  public Murmel(int xPos, int yPos, boolean imSpiel) {
    this.xPos = xPos;
    this.yPos = yPos;
    this.imSpiel = imSpiel;
  }

  // Anfang Methoden
  public void bewegen(int deltaX, int deltaY) {
    this.xPos += deltaX;
    this.yPos += deltaY;
  }

  public int getXPos() {
    return xPos;
  }
  public void setXPos(int xPos) {
    this.xPos = xPos;
  }

  public int getYPos() {
    return yPos;
  }
  public void setYPos(int yPos) {
    this.yPos = yPos;
  }

  public boolean getImSpiel() {
    return imSpiel;
  }
  public void setImSpiel(boolean imSpiel) {
    this.imSpiel = imSpiel;
  }

  // Ende Methoden
} // end of Murmel
