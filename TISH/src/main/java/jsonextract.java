import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonextract {
    public static void main(String[] args) throws IOException, ParseException {

        JSONParser parser = new JSONParser();         // JSON 파일 읽기
         Reader reader = new FileReader("C:\\Users\\JAESEUNG\\Desktop\\spring\\datas\\Map001.json");
        JSONObject jsonObject = (JSONObject) parser.parse(reader);
        JSONArray events = (JSONArray) jsonObject.get("events");


        for(int i=0; i<events.size(); i++){
            JSONObject event = (JSONObject) events.get(i);
            for(int j=0; j<event.size(); j++){
                JSONArray pages = (JSONArray) jsonObject.get("pages");

            }
        }

    }
}
