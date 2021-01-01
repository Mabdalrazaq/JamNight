package database;

import application.Reader;
import band.Band;
import band.Musician;
import java.util.List;

public class DB {
  public static List<Band> bands;
  public static List<Musician> bandlessMusicians;

  private DB(){}

  public static void seedData(){
    bands= Reader.readBandsFromJson();
    bandlessMusicians=Reader.readBandlessMusiciansFromJson();
  }

}
