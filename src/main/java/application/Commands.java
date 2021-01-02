package application;

import static database.DB.bandlessMusicians;
import static database.DB.bands;

import band.Band;
import band.Musician;
import java.util.Collections;
import java.util.Scanner;

public class Commands {

  private static Musician removedMember;


  private Commands() {
  }

  private static void play() {
    for (Band band : bands) {
      removeMemberFromBand(band);
      addNewMemberToBand(band);
      addRemovedMemberToBandlessGroup();
    }
  }

  private static void removeMemberFromBand(Band band) {
    if(band.getMembers().size()<=0)
      return;
    removedMember = band.getRandomMember();
    band.removeMember(removedMember);
    Printer.printLeaving(removedMember, band);
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

  private static void addRemovedMemberToBandlessGroup() {
    if(removedMember!=null)
      bandlessMusicians.add(removedMember);
    removedMember=null;
  }

  private static void list() {
    printBandsDetails();
    printBandlessDetails();
  }

  private static void printBandsDetails() {
    for (Band band : bands) {
      Printer.printBandDetails(band);
    }
  }

  private static void printBandlessDetails() {
    if(bandlessMusicians.size()>0)
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
