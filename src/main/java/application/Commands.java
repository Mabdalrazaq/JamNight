package application;

import static database.DB.bandlessMusicians;
import static database.DB.bands;

import band.Band;
import band.Musician;
import java.util.Collections;
import java.util.Scanner;

public class Commands {

  private Commands() {
  }

  private static void play() {
    for (Band band : bands) {
      Musician memberToBeRemoved = band.getRandomMember();
      removeMemberFromBand(memberToBeRemoved, band);
      addNewMemberToBand(band);
      addRemovedMemberToBandlessGroup(memberToBeRemoved);
    }
  }

  private static void removeMemberFromBand(Musician memberToBeRemoved, Band band) {
    band.removeMember(memberToBeRemoved);
    Printer.printLeaving(memberToBeRemoved, band);
  }

  private static void addNewMemberToBand(Band band) {
    Collections.shuffle(bandlessMusicians);
    for (Musician musician : bandlessMusicians) {
      if (band.hasMembersWithSameInstrument(musician)) {
        continue;
      }
      band.addMember(musician);
      bandlessMusicians.remove(musician);
      Printer.printJoining(musician, band);
      break;
    }
  }

  private static void addRemovedMemberToBandlessGroup(Musician memberToBeRemoved) {
    bandlessMusicians.add(memberToBeRemoved);
  }

  private static void list() {
    for (Band band : bands) {
      Printer.printBandDetails(band);
    }
    Printer.printBandlessMusiciansDetails(bandlessMusicians);
  }

  private static void exit() {
    System.exit(1);
  }

  public static void executeCommand() {
    System.out.print("$ ");
    Scanner scanner = new Scanner(System.in);
    String commandString = scanner.nextLine();
    switch (CommandType.getTypeFromString(commandString.toUpperCase())) {
      case PLAY -> play();
      case LIST -> list();
      case EXIT -> exit();
      case WRONG -> Printer.printWrongCommand();
    }
    executeCommand();
  }

}
