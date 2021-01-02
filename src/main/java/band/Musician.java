package band;

import instrument.Instrument;
import instrument.InstrumentType;
import java.util.Objects;

public class Musician {

  private final String name;
  private final Instrument instrument;

  public Musician(String name, Instrument instrument) {
    this.name = name;
    this.instrument = instrument;
  }

  public String getName() {
    return name;
  }

  public Instrument getInstrument() {
    return instrument;
  }

  public InstrumentType getInstrumentType() {
    return instrument.getType();
  }

  @Override
  public String toString() {
    return "Musician"
        + "\n" + "name: " + name
        + "\n" + instrument;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Musician musician = (Musician) o;
    return Objects.equals(name, musician.name) &&
        Objects.equals(instrument, musician.instrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, instrument);
  }
}
