package instrument;

import java.util.Objects;

public class Piano extends KeyboardFamily {

  private boolean isAcoustic;

  public Piano(String manufacturerName) {
    super(manufacturerName);
  }

  public void setAcoustic(boolean isAcoustic) {
    this.isAcoustic = isAcoustic;
  }

  public boolean isAcoustic() {
    return isAcoustic;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Piano that = (Piano) o;
    if(getManufacturerName()!=that.getManufacturerName())
      return false;
    if(getNumOfKeys()!=that.getNumOfKeys())
      return false;
    if(isAcoustic!=that.isAcoustic())
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getManufacturerName(),getNumOfKeys(),isAcoustic);
  }


}
