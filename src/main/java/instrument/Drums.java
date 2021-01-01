package instrument;

public class Drums extends PercussionFamily {

  public static class Builder extends PercussionFamily.Builder{

    public Drums build() {
      return new Drums(this);
    }
  }

  public Drums(Builder builder) {
    super(builder);
  }

  public InstrumentType getType() {
    return InstrumentType.DRUMS;
  }

  @Override
  public String toString() {
    return "Instrument: Drums"
        +"\n"+super.toString();

  }
}
