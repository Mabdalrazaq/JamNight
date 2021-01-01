package instrument;

public class Guitar extends StringedFamily {

  public Guitar(Builder builder) {
    super(builder);
  }

  public InstrumentType getType() {
    return InstrumentType.GUITAR;
  }

  public static class Builder extends StringedFamily.Builder{

    public StringedFamily build() {
      return new Guitar(this);
    }
  }

  @Override
  public String toString() {
    return "Instrument: Guitar"
        +"\n"+super.toString();
  }
}
