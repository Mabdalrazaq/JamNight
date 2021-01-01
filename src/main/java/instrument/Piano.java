package instrument;

public class Piano extends KeyboardFamily {

  private boolean isAcoustic;

  public Piano(String manufacturerName) {
    super(manufacturerName);
  }

  public void setAcoustic(boolean isAcoustic) {
    this.isAcoustic = isAcoustic;
  }

  public InstrumentType getType() {
    return InstrumentType.PIANO;
  }

  @Override
  public String toString() {
    return "Instrument: Piano"
        + "\n" + "-is" + (isAcoustic ? " " : " not ") + "acoustic"
        + "\n" + super.toString();
  }

}
