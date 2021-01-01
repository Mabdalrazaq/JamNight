package instrument;

public class Banjo extends StringedFamily {

  public Banjo(String manufacturerName) {
    super(manufacturerName);
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
