package instrument;

public abstract class PercussionFamily extends AbstractInstrument {

  private boolean hasHiHat;

  public PercussionFamily(String manufacturerName) {
    super(manufacturerName);
  }

  public void setHasHiHat(boolean hasHiHat) {
    this.hasHiHat = hasHiHat;
  }

  public boolean hasHiHat() {
    return hasHiHat;
  }
}
