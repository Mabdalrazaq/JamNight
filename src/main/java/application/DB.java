package application;

import band.Band;
import band.Musician;
import instrument.Banjo;
import instrument.Drums;
import instrument.Guitar;
import instrument.Piano;
import instrument.Synthesizer;
import java.util.ArrayList;
import java.util.List;

public class DB {
  public static List<Band> bands=new ArrayList<>();
  public static List<Musician> bandlessMusicians=new ArrayList<>();

  private DB(){}

  public static void seedData(){
//    bands=Reader.readBandsFromJson();
//    bandlessMusicians=Reader.readBandlessMusiciansFromJson();
    Band band=new Band("Spoke 'n hub");
    band.addMember(new Musician("Liza Baar",new Guitar.Builder().setNumOfStrings(5).setSizeOfString(0.4).setManufacturerName("Bender").build()));
    band.addMember(new Musician("Null Beat",new Piano.Builder().setAcoustic(true).setNumOfKeys(51).setManufacturerName("McFaren").build()));
    band.addMember(new Musician("Void",new Synthesizer.Builder().setLed(true).setNumOfKeys(47).setManufacturerName("Lorg").build()));
    bands.add(band);
    band=new Band("Feelrats");
    band.addMember(new Musician("Stringsteen",new Banjo.Builder().setNumOfStrings(4).setSizeOfString(8).setManufacturerName("Gibson").build()));
    band.addMember(new Musician("Xindea",new Drums.Builder().setHiHat(true).setManufacturerName("Toyota").build()));
    band.addMember(new Musician("Captor",new Synthesizer.Builder().setLed(false).setNumOfKeys(72).setManufacturerName("Suzuki").build()));
    bands.add(band);

    bandlessMusicians.add(new Musician("Sloe Jee",new Banjo.Builder().setNumOfStrings(4).setSizeOfString(0.7).setManufacturerName("Spic").build()));

  }

}
