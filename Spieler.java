/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.01.2025
 * @author  Team LK
 */

public class Spieler {
  
  // Anfang Attribute
  private String name;
  private double koennen;
  static Murmel meineMurmel;
  // Ende Attribute
  
  public Spieler(String name, double koennen) {
    this.name = name;
    this.koennen = koennen;
  }

  // Anfang Methoden
  public void murmelEinwerfen(int x, int y){
    if (meineMurmel != null){
      int berechnetesX = (int) (x*koennen);
      int berechnetesY = (int) (y*koennen);
    meineMurmel.bewegen(berechnetesX, berechnetesY);
    meineMurmel.setImSpiel(true);
    }
  }
  public void murmelSchieben(int deltaX, int deltaY){
    if (meineMurmel != null && meineMurmel.getImSpiel()){
      meineMurmel.bewegen(meineMurmel.getXPos()+deltaX, meineMurmel.getYPos()+deltaY);
    }
  }
  public void setMeineMurmel (Murmel meineMurmel){
    Spieler.meineMurmel = meineMurmel;
  }
  public Murmel getMeineMurmel() {
      return meineMurmel;
  }
  // Ende Methoden
} // end of Spieler
