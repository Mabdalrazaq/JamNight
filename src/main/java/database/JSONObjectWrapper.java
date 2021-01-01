package database;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONObjectWrapper {

  public final JSONObject jsonObject;

  public JSONObjectWrapper(JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  public int getInt(String key) {
    return jsonObject.get(key) == null ? 0 : (int) (long) jsonObject.get(key);
  }

  public double getDouble(String key) {
    return jsonObject.get(key) == null ? 0 : ((Number) jsonObject.get(key)).doubleValue();
  }

  public JSONObjectWrapper getJsonObject(String key) {
    return jsonObject.get(key) == null
        ? new JSONObjectWrapper(new JSONObject())
        : new JSONObjectWrapper((JSONObject) jsonObject.get(key));
  }

  public Boolean getBoolean(String key) {
    return jsonObject.get(key) != null && (Boolean) jsonObject.get(key);
  }

  public JSONArrayWrapper getJsonArray(String key) {
    return jsonObject.get(key) == null
        ? new JSONArrayWrapper(new JSONArray())
        : new JSONArrayWrapper((JSONArray) jsonObject.get(key));
  }

  public String getString(String key) {
    return jsonObject.get(key) == null ? "" : (String) jsonObject.get(key);
  }
}
