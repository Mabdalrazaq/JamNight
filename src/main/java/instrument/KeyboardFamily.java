package instrument;

public abstract class KeyboardFamily implements Instrument {
  private final String manufacturerName;
  private final int numOfKeys;

  public abstract static class Builder {

    private String manufacturerName;
    private int numOfKeys;

    public Builder() {
      manufacturerName="unknown";
      numOfKeys=0;
    }

    public Builder setManufacturerName(String manufacturerName) {
      this. manufacturerName=manufacturerName;
      return this;
    }

    public Builder setNumOfKeys(int numOfKeys) {
      this.numOfKeys=numOfKeys;
      return this;
    }

    public abstract KeyboardFamily build();
  }

  public KeyboardFamily(Builder builder) {
    manufacturerName=builder.manufacturerName;
    numOfKeys=builder.numOfKeys;
  }

  public String getManufacturerName() {
    return manufacturerName;
  }


  public int getNumOfKeys() {
    return numOfKeys;
  }

}
