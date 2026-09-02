/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.01.2025
 * @author 
 */

public class Spielfeld {
  
  // Anfang Attribute
  private Loch loch;
  private Murmel murmel1;
  private Murmel murmel2;
  // Ende Attribute
  
  public Spielfeld(Loch loch) {
    this.loch = loch;
  }

  // Anfang Methoden
  public void murmelPlatzieren(Murmel neueMurmel) {
    if (this.murmel1 == null) {
      this.murmel1 = neueMurmel;
    } else if (this.murmel2 == null) {
      this.murmel2 = neueMurmel;
    } else {
      System.out.println("Spielfeld ist bereits voll!");
    }
  }

  public static void main(String[] args) {
    // 1. Loch und Spielfeld erstellen
    Loch loch = new Loch(7, 3);
    Spielfeld feld7 = new Spielfeld(loch);
  
    // 2. Murmeln erstellen
    Murmel murmeline = new Murmel(0, 0, false);
    Murmel lieblingsmurmel = new Murmel(0, 0, false);

    // 3. Spieler erstellen und Murmeln zuweisen
    Spieler mats = new Spieler("Mats", 0.8);
    Spieler leo = new Spieler("Leo", 0.6);

    // 4. Spielzüge ausführen
    
  
    mats.murmelEinwerfen(5, 4);
    feld7.murmelPlatzieren(mats.getMeineMurmel());

    leo.murmelEinwerfen(5, 4);
    feld7.murmelPlatzieren(leo.getMeineMurmel());

    // Auswertung
    System.out.println("Mats Murmel ist im Spiel: " + murmeline.getImSpiel());
    System.out.println("Position Mats Murmel: X=" + murmeline.getXPos() + ", Y=" + murmeline.getYPos());
    System.out.println("Position Leo Murmel: X=" + lieblingsmurmel.getXPos() + ", Y=" + lieblingsmurmel.getYPos());

    mats.setMeineMurmel(new Murmel(10, 10, false));
    mats.murmelEinwerfen(24, 19);
    System.out.println("Mats hat die Murmel eingeworfen!");
    System.out.println("Auf der X-Achse: " + mats.meineMurmel.getXPos());
    System.out.println("Auf der Y-Achse: " + mats.meineMurmel.getYPos());
  }

  
  // Ende Methoden
} // end of Spielfeld
