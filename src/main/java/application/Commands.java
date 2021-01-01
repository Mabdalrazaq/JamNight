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
      Musician removedMember=band.getRandomMember();
      band.removeMember(removedMember);
      Printer.printLeaving(removedMember,band);
      Collections.shuffle(bandlessMusicians);
      for(Musician musician:bandlessMusicians){
        if(band.hasMembersWithSameInstrument(musician))
          continue;
        band.addMember(musician);
        Printer.printJoining(musician,band);
      }
      bandlessMusicians.add(removedMember);
    }
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
    System.out.println("$ ");
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
