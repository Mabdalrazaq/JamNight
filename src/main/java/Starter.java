import instrument.Drums;
import instrument.Instrument;
import instrument.Piano;

public class Starter {

  public static void main(String[] args) {
    Instrument instrument= new Drums.Builder().setManufactureName("dsfdsfdsf").setHiHat(true).build();
    System.out.println(instrument);

    Instrument instrument1=new Piano.Builder().setAcoustic(true).setManufacturerName("dsfdsfds").setNumOfKeys(3).build();
    System.out.println(instrument1);
  }

}
