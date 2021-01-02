package application;

public enum CommandType {
  PLAY,
  LIST,
  EXIT,
  WRONG;

  public static CommandType getTypeFromString(String commandString){
    try{
      return valueOf(commandString);
    }catch(IllegalArgumentException e){
      return CommandType.WRONG;
    }
  }
}
