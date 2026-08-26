/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.01.2025
 * @author 
 */

public class Spielfeld {
  
  // Anfang Attribute
  private static Murmel Murmel;
  private static Loch Loch1;
  private static Murmel alleMurmeln;
  // Ende Attribute
  
  public Spielfeld() {
  }

  // Anfang Methoden
  public static void main(String[] argv) {
    Spielfeld Spielfeld1 = new Spielfeld();
    Loch1.setPosition();
    System.out.println("Position des Lochs: " + Loch1.getPosition()); // Ausgabe 1
    Spieler Alice = new Spieler("Alice");
    Spieler Bob = new Spieler("Bob");
    Alice.ersteMurmel = new Murmel(16);
    Alice.ersteMurmel.distanz = Math.abs(Loch1.getPosition() - Alice.ersteMurmel.position);
    alleMurmeln = Alice.ersteMurmel;
    //while (alleMurmeln.naechste != null) { 
    System.out.println("Distanz der ersten Murmel von Alice: " + alleMurmeln.distanz); // Ausgabe 2
    System.out.println(alleMurmeln.naechsteMurmel); // Ausgabe 3
    Bob.ersteMurmel = new Murmel(8);
    Bob.ersteMurmel.distanz = Math.abs(Loch1.getPosition() - Bob.ersteMurmel.position);
    System.out.println("Distanz der ersten Murmel von Bob: " + Bob.ersteMurmel.distanz); // Ausgabe 4
    //} // end of while
  }
  // Ende Methoden
} // end of Spielfeld
