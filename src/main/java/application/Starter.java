package application;

public class Starter {

  public static void main(String[] args) {
    DB.seedData();
    Commands.executeCommand();
  }

}
