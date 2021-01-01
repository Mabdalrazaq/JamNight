package band;

import instrument.Instrument;

public class Musician {
  private String name;
  private Instrument instrument;

  public Musician(String name, Instrument instrument){
    this.name=name;
    this.instrument=instrument;
  }

  public String getName() {
    return name;
  }

  public Instrument getInstrument() {
    return instrument;
  }

  public boolean compareInstrument(Musician other){
    return instrument.compareInstrument(other.getInstrument());
  }

  @Override
  public String toString() {
    return "band.Musician{" +
        "name='" + name + '\'' +
        ", instrument=" + instrument +
        '}';
  }
}
