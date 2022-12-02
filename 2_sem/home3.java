import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class home3 {
    public static void main(String[] args) {
        Create();

        try {
            JSONParser pars = new JSONParser();
            JSONObject jsO = (JSONObject) pars.parse(new FileReader("Home3.json"));
            String f = jsO.toString().replaceAll("\\{", "").replaceAll("}", "").replaceAll("\"", "");
            f = f.replaceAll("предмет:", "").replaceAll("фамилия:", "");

            String[] repl = {"p1:",",p2:",",p3:"};
            for (int i = 0; i < repl.length; i++) f = f.replaceAll(repl[i], "");

            StringBuilder s = new StringBuilder();
            String[] arr = f.split("оценка:");
            for (int i = 1; i < arr.length; i++) {
                String[] k = arr[i].split(",");
                s.append("Студент ");
                s.append(k[2]);
                s.append(" получил " + k[0]);
                s.append(" по предмету " + k[1] + "\n");

            }

            System.out.println(s);

        }catch (IOException e){
            e.getStackTrace();
        }catch (ParseException e2){
            e2.getStackTrace();
        }

    }
    public static void Create(){
        JSONObject js1 = new JSONObject();
        JSONObject js2 = new JSONObject();
        JSONObject js3 = new JSONObject();
        JSONObject jsO = new JSONObject();

        js1.put("фамилия","Иванов");
        js1.put("оценка","5");
        js1.put("предмет","Математика");
        jsO.put("p1", js1);

        js2.put("фамилия","Петрова");
        js2.put("оценка","4");
        js2.put("предмет","Информатика");
        jsO.put("p2",js2);

        js3.put("фамилия","Краснов");
        js3.put("оценка","5");
        js3.put("предмет","Физика");
        jsO.put("p3",js3);

        try{
            FileWriter fr = new FileWriter("Home3.json");
            fr.write(jsO.toJSONString());
            fr.close();

        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
