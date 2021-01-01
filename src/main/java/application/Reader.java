package application;

import band.Band;
import band.Musician;
import instrument.Instrument;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reader {
  private static final String BANDS_JSON="json/bands.json";
  private static final String BANDLESS_JSON="json/bandless.json";
  private static final JSONParser jsonParser=new JSONParser();
  private static JSONArrayWrapper bandsJsonArray;
  private static JSONArrayWrapper bandlessJsonArray;

  private Reader(){}

  public static List<Band> readBandsFromJson(){
    List<Band> bands=new ArrayList<>();
    parseJsonBands();
    for(JSONObjectWrapper jsonBand:bandsJsonArray.getList()){
      Band band=new Band(jsonBand.getString("name"));
      JSONArrayWrapper jsonMusicians=jsonBand.getJsonArray("members");
      for(JSONObjectWrapper jsonMusician: jsonMusicians.getList()){
        Musician musician= buildMusicianFromJson(jsonMusician);
        band.addMember(musician);
      }
      bands.add(band);
    }
    return bands;
  }


  public static List<Musician> readBandlessMusiciansFromJson(){
    List<Musician> bandless=new ArrayList<>();
    parseJsonBandless();
    for(JSONObjectWrapper jsonMusician: bandlessJsonArray.getList()){
      Musician musician=buildMusicianFromJson(jsonMusician);
      bandless.add(musician);
    }
    return bandless;
  }

  private static Musician buildMusicianFromJson(JSONObjectWrapper jsonMusician){
    String musicianName=jsonMusician.getString("name");
    Instrument instrument=InstrumentBuilder.buildInstrumentFromJson(jsonMusician.getJsonObject("instrument"));
    return new Musician(musicianName,instrument);
  }


  private static void parseJsonBands() {
    try (FileReader reader = new FileReader(BANDS_JSON)) {
      bandsJsonArray = new JSONArrayWrapper((JSONArray) jsonParser.parse(reader));
    } catch (ParseException e) {
      System.out.println(e.getMessage());
    }catch (IOException e){
      System.out.println(e.getMessage());
    }
  }

  private static void parseJsonBandless(){
    try (FileReader reader = new FileReader(BANDLESS_JSON)) {
      bandlessJsonArray = new JSONArrayWrapper((JSONArray) jsonParser.parse(reader));
    } catch (ParseException e) {
      System.out.println(e.getMessage());
    }catch (IOException e){
      System.out.println(e.getMessage());
    }
  }

}
