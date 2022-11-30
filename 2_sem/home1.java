//package 2_sem;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class home1 {
    public static void main(String[] args) {
        Create();

        try{
            Reader reader = new FileReader("Home1.json");
            JSONParser parser = new JSONParser();
            JSONObject data = (JSONObject)parser.parse(reader);
            String[] c = data.toString().replaceAll("\"", "").replaceAll("\\{", "").replaceAll("}", "").split(",");
            StringBuilder res = new StringBuilder("select * from students where");

            for (int i = 0; i < c.length; i++) {

                if (c[i].contains("null") == false) {
                    c[i] = c[i].replace(":", " = '") + "'";
                    res.append(" " + c[i] + " and");
                }
            }
            System.out.println(res.substring(0, res.length()-4) + ";");
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
//        System.out.println(jsonchick);

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
