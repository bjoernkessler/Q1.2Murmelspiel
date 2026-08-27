/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.01.2025
 * @author 
 */
import java.sql.SQLOutput;
import java.util.Scanner;

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
    Scanner input = new Scanner(System.in);
    Spielfeld Spielfeld1 = new Spielfeld();
    Loch1.setPosition();
    
    System.out.println("Die Position von Loch1 ist: " + java.util.Arrays.toString(Loch1.getPosition()));
    Spieler Alice = new Spieler("Alice", 0.8);
    Spieler Bob = new Spieler("Bob", 0.6);
    Alice.setMeineMurmel(new Murmel());
    Bob.setMeineMurmel(new Murmel());
    Alice.murmelEinwerfen(10, 5);
    System.out.println("Alice hat die Murmel eingeworfen!");
    System.out.println("Abstand auf der X-Achse: " + (Math.abs(Loch1.getPosition()[0] - Alice.meineMurmel.getxPos())));
    System.out.println("Abstand auf der Y-Achse: " + (Math.abs(Loch1.getPosition()[1] - Alice.meineMurmel.getyPos())));
    //while (alleMurmeln.naechste != null) { 

    //} // end of while
  }

  // Ende Methoden
} // end of Spielfeld
