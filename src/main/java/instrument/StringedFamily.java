package instrument;

public abstract class StringedFamily extends AbstractInstrument {
  private final String manufacturerName;
  private final int numOfStrings;
  private final double sizeOfString; //In mm

  public abstract static class Builder {

    private String manufacturerName;
    private int numOfStrings;
    private double sizeOfString;

    public Builder() {
      manufacturerName="unknown";
      numOfStrings=0;
      sizeOfString=0;
    }

    public Builder setManufacturerName(String manufacturerName) {
      this. manufacturerName=manufacturerName;
      return this;
    }
    public Builder setNumOfStrings(int numOfStrings) {
      this.numOfStrings=numOfStrings;
      return this;
    }
    public Builder setSizeOfString(double sizeOfString) {
      this.sizeOfString=sizeOfString;
      return this;
    }


    public abstract StringedFamily build();
  }

  public StringedFamily(Builder builder) {
    manufacturerName=builder.manufacturerName;
    numOfStrings=builder.numOfStrings;
    sizeOfString=builder.sizeOfString;
  }

  public String getManufacturerName() {
    return manufacturerName;
  }

  public int getNumOfStrings() {
    return numOfStrings;
  }

  public double getStringSize() {
    return sizeOfString;
  }

  @Override
  public String toString() {
    return "-number of strings: "+numOfStrings
        +"\n"+"-string size: "+sizeOfString+"mm"
        +"\n"+"-manufacturer: "+manufacturerName;
  }
}
