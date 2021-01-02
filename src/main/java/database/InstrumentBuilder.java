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
    Guitar guitar=new Guitar(jsonInstrument.getString("manufacturer"));
    guitar.setStringsNum(jsonInstrument.getInt("stringsNum"));
    guitar.setStringSize(jsonInstrument.getDouble("stringSize"));
    return guitar;
  }

  private static Instrument buildPianoFromJson(JSONObjectWrapper jsonInstrument) {
    Piano piano=new Piano(jsonInstrument.getString("manufacturer"));
    piano.setAcoustic(jsonInstrument.getBoolean("isAcoustic"));
    piano.setNumOfKeys(jsonInstrument.getInt("keysNum"));
    return piano;
  }

  private static Instrument buildBanjoFromJson(JSONObjectWrapper jsonInstrument) {
    Banjo banjo=new Banjo(jsonInstrument.getString("manufacturer"));
    banjo.setStringsNum(jsonInstrument.getInt("stringsNum"));
    banjo.setStringSize(jsonInstrument.getDouble("stringSize"));
    return banjo;
  }

  private static Instrument buildSynthesizerFromJson(JSONObjectWrapper jsonInstrument) {
    Synthesizer synthesizer=new Synthesizer(jsonInstrument.getString("manufacturer"));
    synthesizer.setHasLed(jsonInstrument.getBoolean("hasLed"));
    synthesizer.setNumOfKeys(jsonInstrument.getInt("keysNum"));
    return synthesizer;
  }

  private static Instrument buildDrumsFromJson(JSONObjectWrapper jsonInstrument) {
    Drums drums=new Drums(jsonInstrument.getString("manufacturer"));
    drums.setHasHiHat(jsonInstrument.getBoolean("hasHiHat"));
    return drums;
  }

}
