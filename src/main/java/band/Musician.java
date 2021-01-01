package band;

import instrument.Instrument;
import instrument.InstrumentType;

public class Musician {
  private final String name;
  private final Instrument instrument;

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

  public InstrumentType getInstrumentType(){
    return instrument.getType();
  }
  @Override
  public String toString() {
    return "Musician"
        +"\n"+"name: "+name
        +"\n"+instrument;
  }
}
