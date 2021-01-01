public class Drums extends Percussion {

  public static class Builder extends Percussion.Builder{

    public Drums build() {
      return new Drums(this);
    }
  }

  public Drums(Builder builder) {
    super(builder);
  }

  public InstrumentType getType() {
    return InstrumentType.DRUMS;
  }

  @Override
  public String toString() {
    return "Drums"
        +"\n"+", has hi-hat= " + hasHiHat()
        +"\n"+", manufacturer= "+getManufacturerName();

  }
}
