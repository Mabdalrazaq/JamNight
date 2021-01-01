package database;

import instrument.Banjo;
import instrument.Drums;
import instrument.Guitar;
import instrument.Instrument;
import instrument.InstrumentType;
import instrument.Piano;
import instrument.Synthesizer;

public class InstrumentBuilder {

  private InstrumentBuilder() {
  }

  public static Instrument buildInstrumentFromJson(JSONObjectWrapper jsonInstrument) {
    return switch (InstrumentType.valueOf(jsonInstrument.getString("type").toUpperCase())) {
      case GUITAR -> new Guitar.Builder(jsonInstrument.getString("manufacturer"))
          .setSizeOfString(jsonInstrument.getDouble("stringSize"))
          .setNumOfStrings(jsonInstrument.getInt("stringsNum"))
          .build();
      case PIANO -> new Piano.Builder(jsonInstrument.getString("manufacturer"))
          .setAcoustic(jsonInstrument.getBoolean("isAcoustic"))
          .setNumOfKeys(jsonInstrument.getInt("keysNum"))
          .build();
      case BANJO -> new Banjo.Builder(jsonInstrument.getString("manufacturer"))
          .setSizeOfString(jsonInstrument.getDouble("stringSize"))
          .setNumOfStrings(jsonInstrument.getInt("stringsNum"))
          .build();
      case SYNTHESIZER -> new Synthesizer.Builder(jsonInstrument.getString("manufacturer"))
          .setLed(jsonInstrument.getBoolean("hasLed"))
          .setNumOfKeys(jsonInstrument.getInt("keysNum"))
          .build();
      case DRUMS -> new Drums.Builder(jsonInstrument.getString("manufacturer"))
          .setHiHat(jsonInstrument.getBoolean("hasHiHat"))
          .build();
    };
  }
}
