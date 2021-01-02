package instrument;

public abstract class StringedFamily extends AbstractInstrument {

  private int StringsNum;
  private double StringSize; //In mm


  public StringedFamily(String manufacturerName) {
    super(manufacturerName);
  }

  public double getStringSize() {
    return StringSize;
  }

  public void setStringSize(double stringSize) {
    this.StringSize = stringSize;
  }

  public int getStringsNum() {
    return StringsNum;
  }

  public void setStringsNum(int stringsNum) {
    this.StringsNum = stringsNum;
  }
}
