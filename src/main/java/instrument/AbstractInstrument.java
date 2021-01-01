package instrument;

public abstract class AbstractInstrument implements Instrument {

  private final String manufacturerName;

  public static abstract class Builder {

    private final String manufacturerName;

    public Builder(String manufacturerName) {
      this.manufacturerName = manufacturerName;
    }

    public abstract AbstractInstrument build();
  }

  public AbstractInstrument(Builder builder) {
    manufacturerName = builder.manufacturerName;
  }

  @Override
  public String toString() {
    return "-manufacturer: " + manufacturerName;
  }

}
