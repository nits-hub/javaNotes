package String;
import java.util.*;

public class CalculateFrequencyOfString {
    public static void main(String[] args) {
        String str = "WaterTank";
        str = str.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                int value = map.get(str.charAt(i)) + 1;
                map.put(str.charAt(i), value);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        // System.out.println(map);
        String res = map.toString();
        System.out.println(res);
    }
}
