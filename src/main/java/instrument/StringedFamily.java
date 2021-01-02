package instrument;

public abstract class StringedFamily extends AbstractInstrument {

  private int StringsNum;
  private double StringSize; //In mm


  public StringedFamily(String manufacturerName) {
    super(manufacturerName);
  }

  public void setStringsNum(int stringsNum) {
    this.StringsNum = stringsNum;
  }

  public void setStringSize(double stringSize) {
    this.StringSize = stringSize;
  }

  public double getStringSize() {
    return StringSize;
  }

  public int getStringsNum() {
    return StringsNum;
  }
}
