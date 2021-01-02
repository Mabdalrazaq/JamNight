package instrument;

public class Synthesizer extends KeyboardFamily {

  private boolean hasLed;

  public Synthesizer(String manufacturerName) {
    super(manufacturerName);
  }

  public void setHasLed(boolean hasLed) {
    this.hasLed = hasLed;
  }

  public boolean hasLed() {
    return hasLed;
  }

  public InstrumentType getType() {
    return InstrumentType.SYNTHESIZER;
  }

  @Override
  public String toString() {
    return "Instrument: Synthesizer"
        + "\n" + "-has" + (hasLed ? " " : " no ") + "led"
        + "\n" + super.toString();
  }
}
