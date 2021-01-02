package instrument;

import java.util.Objects;

public class Drums extends PercussionFamily {

  public Drums(String manufacturerName) {
    super(manufacturerName);
  }

  public InstrumentType getType() {
    return InstrumentType.DRUMS;
  }

  @Override
  public String toString() {
    return "Instrument: Drums"
        + "\n" + super.toString();

  }

  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drums that = (Drums) o;
    if(getManufacturerName()!=that.getManufacturerName())
      return false;
    if(hasHiHat()!=that.hasHiHat())
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getManufacturerName(),hasHiHat());
  }


}
