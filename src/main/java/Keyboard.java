public abstract class Keyboard {
  private final String manufacturerName;
  private final int numOfKeys;

  public abstract static class Builder {

    private String manufacturerName;
    private int numOfKeys;

    public Builder() {
      manufacturerName="unknown";
      numOfKeys=0;
    }

    public Builder manufacturerName(String manufacturerName) {
      this. manufacturerName=manufacturerName;
      return this;
    }

    public Builder numOfKeys(int numOfKeys) {
      this.numOfKeys=numOfKeys;
      return this;
    }

    public abstract Keyboard build();
  }

  public Keyboard(Builder builder) {
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
