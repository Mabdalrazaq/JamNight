package instrument;

public abstract class StringedFamily extends AbstractInstrument {

  private final int numOfStrings;
  private final double sizeOfString; //In mm

  public abstract static class Builder extends AbstractInstrument.Builder {

    private int numOfStrings;
    private double sizeOfString;

    public Builder(String manufacturerName) {
      super(manufacturerName);
      numOfStrings = 0;
      sizeOfString = 0;
    }

    public Builder setNumOfStrings(int numOfStrings) {
      this.numOfStrings = numOfStrings;
      return this;
    }

    public Builder setSizeOfString(double sizeOfString) {
      this.sizeOfString = sizeOfString;
      return this;
    }


    public abstract StringedFamily build();
  }


  public StringedFamily(Builder builder) {
    super(builder);
    numOfStrings = builder.numOfStrings;
    sizeOfString = builder.sizeOfString;
  }

  @Override
  public String toString() {
    return "-number of strings: " + numOfStrings
        + "\n" + "-string size: " + sizeOfString + "mm"
        + "\n" + super.toString();
  }
}
