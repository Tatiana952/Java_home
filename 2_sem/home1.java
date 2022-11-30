package sem2;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class home1 {
    public static void main(String[] args) {
        Create();

        try{
            Reader reader = new FileReader("Home1.json");
            JSONParser parser = new JSONParser();
            JSONObject data = (JSONObject)parser.parse(reader);
//            System.out.println(data);
        }catch(IOException e) {
            e.printStackTrace();
        }catch (ParseException parseE){
            parseE.printStackTrace();
        }

        


    }
    public static void Create(){
        JSONObject jsonchick = new JSONObject();
        jsonchick.put("name","Ivanov");
        jsonchick.put("country","Russia");
        jsonchick.put("city","Moscow");
        jsonchick.put("age","null");
        System.out.println(jsonchick);

        try{
            FileWriter file = new FileWriter(new File("Home1.json"));
            file.write(jsonchick.toJSONString());
            file.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("JSON file Home1.json created");


    }
}
