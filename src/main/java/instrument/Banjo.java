package instrument;

public class Banjo extends StringedFamily {

  public static class Builder extends StringedFamily.Builder {

    public Builder(String manufacturerName) {
      super(manufacturerName);
    }

    public StringedFamily build() {
      return new Banjo(this);
    }
  }

  public Banjo(Builder builder) {
    super(builder);
  }

  public InstrumentType getType() {
    return InstrumentType.BANJO;
  }

  @Override
  public String toString() {
    return "Instrument: Banjo"
        + "\n" + super.toString();
  }

}
