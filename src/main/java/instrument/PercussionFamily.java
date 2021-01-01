package instrument;

public abstract class PercussionFamily extends AbstractInstrument {

  public abstract static class Builder extends AbstractInstrument.Builder {

    private boolean hasHiHat;

    public Builder(String manufacturerName) {
      super(manufacturerName);
      hasHiHat = false;
    }

    public Builder setHiHat(boolean hasHiHat) {
      this.hasHiHat = hasHiHat;
      return this;
    }

    public abstract PercussionFamily build();
  }


  private final boolean hasHiHat;

  public PercussionFamily(Builder builder) {
    super(builder);
    hasHiHat = builder.hasHiHat;
  }

  @Override
  public String toString() {
    return "-has" + (hasHiHat ? " " : " no ") + "hi-hat"
        + "\n" + super.toString();
  }

}
