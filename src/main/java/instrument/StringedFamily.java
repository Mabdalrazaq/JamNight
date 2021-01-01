package instrument;

public abstract class StringedFamily extends AbstractInstrument {

  private int numOfStrings;
  private double sizeOfString; //In mm


  public StringedFamily(String manufacturerName) {
    super(manufacturerName);
  }

  public void setNumOfStrings(int numOfStrings) {
    this.numOfStrings = numOfStrings;
  }

  public void setSizeOfString(double sizeOfString) {
    this.sizeOfString = sizeOfString;
  }

  @Override
  public String toString() {
    return "-number of strings: " + numOfStrings
        + "\n" + "-string size: " + sizeOfString + "mm"
        + "\n" + super.toString();
  }
}
