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
      case GUITAR -> buildGuitarFromJson(jsonInstrument);
      case PIANO -> buildPianoFromJson(jsonInstrument);
      case BANJO -> buildBanjoFromJson(jsonInstrument);
      case SYNTHESIZER -> buildSynthesizerFromJson(jsonInstrument);
      case DRUMS -> buildDrumsFromJson(jsonInstrument);
    };
  }

  private static Instrument buildGuitarFromJson(JSONObjectWrapper jsonInstrument) {
    return new Guitar.Builder(jsonInstrument.getString("manufacturer"))
        .setSizeOfString(jsonInstrument.getDouble("stringSize"))
        .setNumOfStrings(jsonInstrument.getInt("stringsNum"))
        .build();
  }

  private static Instrument buildPianoFromJson(JSONObjectWrapper jsonInstrument) {
    return new Piano.Builder(jsonInstrument.getString("manufacturer"))
        .setAcoustic(jsonInstrument.getBoolean("isAcoustic"))
        .setNumOfKeys(jsonInstrument.getInt("keysNum"))
        .build();
  }

  private static Instrument buildBanjoFromJson(JSONObjectWrapper jsonInstrument) {
    return new Banjo.Builder(jsonInstrument.getString("manufacturer"))
        .setSizeOfString(jsonInstrument.getDouble("stringSize"))
        .setNumOfStrings(jsonInstrument.getInt("stringsNum"))
        .build();
  }

  private static Instrument buildSynthesizerFromJson(JSONObjectWrapper jsonInstrument) {
    return new Synthesizer.Builder(jsonInstrument.getString("manufacturer"))
        .setLed(jsonInstrument.getBoolean("hasLed"))
        .setNumOfKeys(jsonInstrument.getInt("keysNum"))
        .build();
  }

  private static Instrument buildDrumsFromJson(JSONObjectWrapper jsonInstrument) {
    return new Drums.Builder(jsonInstrument.getString("manufacturer"))
        .setHiHat(jsonInstrument.getBoolean("hasHiHat"))
        .build();
  }

}
