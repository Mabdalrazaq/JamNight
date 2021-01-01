public abstract class Stringed implements Instrument {
  private final String manufacturerName;
  private final int numOfStrings;
  private final int sizeOfString; //In mm

  public abstract static class Builder {

    private String manufacturerName;
    private int numOfStrings;
    private int sizeOfString;

    public Builder() {
      manufacturerName="unknown";
      numOfStrings=0;
      sizeOfString=0;
    }

    public Builder manufacturerName(String manufacturerName) {
      this. manufacturerName=manufacturerName;
      return this;
    }
    public Builder numOfStrings(int numOfStrings) {
      this.numOfStrings=numOfStrings;
      return this;
    }
    public Builder sizeOfString(String manufacturerName) {
      this. manufacturerName=manufacturerName;
      return this;
    }


    public abstract Stringed build();
  }

  public Stringed(Builder builder) {
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

  public int getStringSize() {
    return sizeOfString;
  }
}
