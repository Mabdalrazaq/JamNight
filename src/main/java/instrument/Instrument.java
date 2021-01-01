package instrument;

public interface Instrument {
  String getManufacturerName();
  InstrumentType getType();
  boolean compareInstrument(Instrument instrument);
}
