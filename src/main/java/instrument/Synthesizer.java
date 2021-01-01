package instrument;

public class Synthesizer extends Keyboard {
  private final boolean hasLed;

  public static class Builder extends Keyboard.Builder{
    private boolean hasLed;
    public Builder(){
      super();
      this.hasLed=false;
    }

    public Builder setLed(boolean hasLed){
      this.hasLed=hasLed;
      return this;
    }

    public Keyboard build() {
      return new Synthesizer(this);
    }
  }

  public Synthesizer(Builder builder) {
    super(builder);
    this.hasLed=builder.hasLed;
  }

  public InstrumentType getType(){
    return InstrumentType.SYNTHESIZER;
  }

  public boolean hasLed() {
    return hasLed;
  }

  @Override
  public String toString() {
    return "Synthesizer"
        +"\n"+", number of keys= "+getNumOfKeys()
        +"\n"+", has led= "+hasLed
        +"\n"+", manufacturer= "+getManufacturerName();
  }
}
