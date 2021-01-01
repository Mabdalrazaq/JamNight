package instrument;

public class Guitar extends StringedFamily {

  public Guitar(String manufacturerName) {
    super(manufacturerName);
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
