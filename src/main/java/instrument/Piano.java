package instrument;

public class Piano extends Keyboard {
  private final boolean isAcoustic;

  public static class Builder extends Keyboard.Builder{
    private boolean isAcoustic;
    public Builder(){
      super();
      this.isAcoustic=false;
    }

    public Builder setAcoustic(boolean isAcoustic){
      this.isAcoustic=isAcoustic;
      return this;
    }

    public Keyboard build() {
      return new Piano(this);
    }
  }

  public Piano(Builder builder) {
    super(builder);
    this.isAcoustic=builder.isAcoustic;
  }

  public InstrumentType getType(){
    return InstrumentType.PIANO;
  }

  public boolean isAcoustic() {
    return isAcoustic;
  }

  @Override
  public String toString() {
    return "Piano"
        +"\n"+", number of keys= "+getNumOfKeys()
        +"\n"+", is acoustic= "+isAcoustic
        +"\n"+", manufacturer= "+getManufacturerName();
  }
}