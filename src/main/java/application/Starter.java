package application;

import database.DB;

public class Starter {

  public static void main(String[] args) {
    DB.seedData();
    Printer.printStartingMessage();
    Commands.executeCommand();
  }

}
