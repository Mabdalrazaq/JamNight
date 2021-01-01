package instrument;

public abstract class KeyboardFamily extends AbstractInstrument {

  private final int numOfKeys;

  public abstract static class Builder extends AbstractInstrument.Builder {

    private int numOfKeys;

    public Builder(String manufacturerName) {
      super(manufacturerName);
      numOfKeys = 0;
    }

    public Builder setNumOfKeys(int numOfKeys) {
      this.numOfKeys = numOfKeys;
      return this;
    }

    public abstract KeyboardFamily build();
  }


  public KeyboardFamily(Builder builder) {
    super(builder);
    numOfKeys = builder.numOfKeys;
  }

  @Override
  public String toString() {
    return "-number of key: " + numOfKeys
        + "\n" + super.toString();
  }

}
