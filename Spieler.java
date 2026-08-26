/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.01.2025
 * @author  Team LK
 */

public class Spieler {
  
  // Anfang Attribute
  private static String Name;
  private static double koennen;
  static Murmel meineMurmel;
  // Ende Attribute
  
  public Spieler(String pName, double pKoennen) {
    Name = pName;
    koennen = pKoennen;
  }

  // Anfang Methoden
  public void murmelEinwerfen(int x, int y){}
  public void murmelSchieben(Murmel m, int x, int y){}
  public static String getName() {
      return Name;
  }
  public static double getKoennen() {
    return koennen;
  }
  public static void setKoennen(double koennen) {
      Spieler.koennen = koennen;
  }
  public static Murmel getMeineMurmel() {
      return meineMurmel;
  }
  public static void setMeineMurmel(Murmel meineMurmel) {
      Spieler.meineMurmel = meineMurmel;
  }
  // Ende Methoden
} // end of Spieler
