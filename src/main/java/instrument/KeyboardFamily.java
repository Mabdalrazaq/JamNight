package instrument;

public abstract class KeyboardFamily extends AbstractInstrument {

  private int numOfKeys;

  public KeyboardFamily(String manufacturerName) {
    super(manufacturerName);
  }

  public void setNumOfKeys(int numOfKeys) {
    this.numOfKeys = numOfKeys;
  }

  public int getNumOfKeys() {
    return numOfKeys;
  }

  @Override
  public String toString() {
    return "-number of key: " + numOfKeys
        + "\n" + super.toString();
  }

}
