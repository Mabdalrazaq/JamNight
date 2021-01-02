package instrument;

public abstract class StringedFamily extends AbstractInstrument {

  private int stringsNum;
  private double stringSize; //In mm


  public StringedFamily(String manufacturerName) {
    super(manufacturerName);
  }

  public double getStringSize() {
    return stringSize;
  }

  public void setStringSize(double stringSize) {
    this.stringSize = stringSize;
  }

  public int getStringsNum() {
    return stringsNum;
  }

  public void setStringsNum(int stringsNum) {
    this.stringsNum = stringsNum;
  }

  public String toString() {
    return "-number of strings: " + stringsNum
        + "\n" + "-string size: " + stringSize + "mm"
        + "\n" + super.toString();
  }
}
