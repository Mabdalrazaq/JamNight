package instrument;

public class Banjo extends StringedFamily {

  public Banjo(Builder builder) {
    super(builder);
  }

  public InstrumentType getType() {
    return InstrumentType.BANJO;
  }

  public static class Builder extends StringedFamily.Builder{

    public StringedFamily build() {
      return new Banjo(this);
    }
  }

  @Override
  public String toString() {
    return "Instrument: Banjo"
        +"\n"+super.toString();
  }
}
