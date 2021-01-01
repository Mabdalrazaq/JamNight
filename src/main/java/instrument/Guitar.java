package instrument;

public class Guitar extends StringedFamily {

  public static class Builder extends StringedFamily.Builder {

    public Builder(String manufacturerName) {
      super(manufacturerName);
    }

    public StringedFamily build() {
      return new Guitar(this);
    }
  }


  public Guitar(Builder builder) {
    super(builder);
  }

  public InstrumentType getType() {
    return InstrumentType.GUITAR;
  }

  @Override
  public String toString() {
    return "Instrument: Guitar"
        + "\n" + super.toString();
  }

}
