public class Banjo extends Stringed {

  public Banjo(Builder builder) {
    super(builder);
  }

  public InstrumentType getType() {
    return InstrumentType.BANJO;
  }

  public static class Builder extends Stringed.Builder{

    public Stringed build() {
      return new Banjo(this);
    }
  }

  @Override
  public String toString() {
    return "Banjo"
        +"\n"+", number of strings= "+getNumOfStrings()
        +"\n"+", string size= "+ getStringSize()
        +"\n"+", manufacturer= "+getManufacturerName();

  }
}
