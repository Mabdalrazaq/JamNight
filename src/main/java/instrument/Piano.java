package instrument;

public class Piano extends KeyboardFamily {
  private final boolean isAcoustic;

  public static class Builder extends KeyboardFamily.Builder{
    private boolean isAcoustic;
    public Builder(){
      super();
      this.isAcoustic=false;
    }

    public Builder setAcoustic(boolean isAcoustic){
      this.isAcoustic=isAcoustic;
      return this;
    }

    public KeyboardFamily build() {
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
    return "Instrument: Piano"
        +"\n"+"is"+(isAcoustic?" ":" not ")+"acoustic"
        +"\n"+super.toString();
  }
}
