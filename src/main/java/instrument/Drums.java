package instrument;

public class Drums extends PercussionFamily {

  public Drums(String manufacturerName) {
    super(manufacturerName);
  }

  public InstrumentType getType() {
    return InstrumentType.DRUMS;
  }

  @Override
  public String toString() {
    return "Instrument: Drums"
        + "\n" + super.toString();

  }

}
