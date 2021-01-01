package instrument;

public abstract class AbstractInstrument implements Instrument {
  public boolean compareInstrument(Instrument instrument){
    return getType()==instrument.getType();
  }
}
