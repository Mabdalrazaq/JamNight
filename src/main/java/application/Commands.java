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
      band.removeMember(band.getRandomMember());

    }
  }

  private static void list(){

  }

  private static void exit(){

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
