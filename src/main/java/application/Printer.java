package application;

import band.Band;
import band.Musician;
import java.util.List;

public class Printer {

  private Printer() {
  }

  public static void printLeaving(Musician musician, Band band) {
    System.out.println(musician.getName() + " left " + band.getName());
  }

  public static void printJoining(Musician musician, Band band) {
    System.out.println(musician.getName() + " joined " + band.getName());
  }

  public static void printBandDetails(Band band) {
    System.out.println("********** Band: " + band.getName() + " **********");
    printMusiciansDetails(band.getMembers());
  }

  public static void printBandlessMusiciansDetails(List<Musician> bandlessMusicians) {
    System.out.println("********** Musicians without a band **********");
    printMusiciansDetails(bandlessMusicians);
  }

  private static void printMusiciansDetails(List<Musician> musicians) {
    for (Musician musician : musicians) {
      System.out.println(musician);
      System.out.println("-------------------------");
    }
  }

  public static void printStartingMessage() {
    System.out.println("Your bands are all ready to perform.");
    System.out.println("Type 'list' to list bands and musicians"
        + "\n" + "or 'play' to see what happens in one night of performance"
        + "\n" + "or 'exit' to get out of the application");

  }

  public static void printWrongCommand() {
    System.out.println("Command not recognized, try 'list', 'play' or 'exit'");
  }
}
