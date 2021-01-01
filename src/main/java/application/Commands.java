package application;

import band.Band;
import band.Musician;
import java.util.Collections;
import java.util.Scanner;
import static application.DB.bands;
import static application.DB.bandlessMusicians;

public class Commands {
  private Commands(){}

  private static void play(){
    for(Band band: bands){
      Musician memberToBeRemoved=band.getRandomMember();
      removeMemberFromBand(memberToBeRemoved,band);
      addNewMemberToBand(band);
      addRemovedMemberToBandlessGroup(memberToBeRemoved);
    }
  }

  private static void removeMemberFromBand(Musician memberToBeRemoved,Band band){
    band.removeMember(memberToBeRemoved);
    Printer.printLeaving(memberToBeRemoved,band);
  }

  private static void addNewMemberToBand(Band band){
    Collections.shuffle(bandlessMusicians);
    for(Musician musician:bandlessMusicians){
      if(band.hasMembersWithSameInstrument(musician))
        continue;
      band.addMember(musician);
      bandlessMusicians.remove(musician);
      Printer.printJoining(musician,band);
      break;
    }
  }

  private static void addRemovedMemberToBandlessGroup(Musician memberToBeRemoved){
    bandlessMusicians.add(memberToBeRemoved);
  }

  private static void list(){
    for(Band band: bands){
      Printer.printBandDetails(band);
    }
    Printer.printBandlessMusiciansDetails(bandlessMusicians);
  }

  private static void exit(){
    System.exit(1);
  }

  public static void executeCommand(){
    System.out.print("$ ");
    Scanner scanner=new Scanner(System.in);
    String commandQuery=scanner.nextLine();
    switch (commandQuery.toLowerCase()){
      case "play"->play();
      case "list"->list();
      case "exit"->exit();
      default -> Printer.printWrongCommand();
    }
    executeCommand();
  }

}
