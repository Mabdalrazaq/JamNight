package instrument;

import java.util.Objects;

public class Guitar extends StringedFamily {

  public Guitar(String manufacturerName) {
    super(manufacturerName);
  }

  public InstrumentType getType() {
    return InstrumentType.GUITAR;
  }

  @Override
  public String toString() {
    return "Instrument: Guitar"
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
    Guitar that = (Guitar) o;
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
