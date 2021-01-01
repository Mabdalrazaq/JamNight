package application;

import band.Band;
import band.NoBand;
import java.util.List;

public class DB {
  public static List<Band> bands;
  public static NoBand bandlessMusicians;

  private DB(){}

  public static void seedData(){
    bands=Reader.readBandsFromJson();
    bandlessMusicians=Reader.readBandlessMusiciansFromJson();
  }

}
