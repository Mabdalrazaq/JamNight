package instrument;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Synthesizer that = (Synthesizer) o;
    if (getManufacturerName() != that.getManufacturerName()) {
      return false;
    }
    if (getNumOfKeys() != that.getNumOfKeys()) {
      return false;
    }
    return hasLed == that.hasLed();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getManufacturerName(), getNumOfKeys(), hasLed);
  }

}
