package instrument;

public class Guitar extends Stringed {

  public Guitar(Builder builder) {
    super(builder);
  }

  public InstrumentType getType() {
    return InstrumentType.GUITAR;
  }

  public static class Builder extends Stringed.Builder{

    public Stringed build() {
      return new Guitar(this);
    }
  }

  @Override
  public String toString() {
    return "Guitar"
        +"\n"+", number of strings= "+getNumOfStrings()
        +"\n"+", string size= "+ getStringSize()
        +"\n"+", manufacturer= "+getManufacturerName();
  }
}
