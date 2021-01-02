package instrument;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Banjo that = (Banjo) o;
    if(getManufacturerName()!=that.getManufacturerName())
      return false;
    if(getStringSize()!=that.getStringSize())
      return false;
    if(getStringsNum()!=that.getStringsNum())
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getManufacturerName(),getStringSize(),getStringsNum());
  }
}
