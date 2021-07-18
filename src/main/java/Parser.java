import java.util.HashMap;
import java.util.Map;

public class Parser {

    public String encode(String word){
        String[] splitWord = word.split("");

        Map<String, String> map = new HashMap<>();
        map.put(" ", "1");
        map.put("A", "2");
        map.put("B", "22");
        map.put("C", "222");
        map.put("D", "3");
        map.put("E", "33");
        map.put("F", "333");
        map.put("G", "4");
        map.put("H", "44");
        map.put("I", "444");
        map.put("J", "5");
        map.put("K", "55");
        map.put("L", "555");
        map.put("M", "6");
        map.put("N", "66");
        map.put("O", "666");
        map.put("P", "7");
        map.put("Q", "77");
        map.put("R", "777");
        map.put("S", "8");
        map.put("T", "88");
        map.put("U", "888");
        map.put("W", "9");
        map.put("Y", "99");
        map.put("Z", "999");

        String result = "";
        for (String inputWord : splitWord){
            for (Map.Entry<String, String> entry : map.entrySet()) {

                if (inputWord.equalsIgnoreCase(entry.getKey())) {
                    result = result.concat(entry.getValue());
                }
            }
        }
        return result;
    }

}
