package instrument;

public class Synthesizer extends KeyboardFamily {
  private final boolean hasLed;

  public static class Builder extends KeyboardFamily.Builder{
    private boolean hasLed;
    public Builder(){
      super();
      this.hasLed=false;
    }

    public Builder setLed(boolean hasLed){
      this.hasLed=hasLed;
      return this;
    }

    public KeyboardFamily build() {
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
    return "Instrument: Synthesizer"
        +"\n"+"has"+(hasLed?" ":" no ")+"led"
        +"\n"+super.toString();
  }
}
