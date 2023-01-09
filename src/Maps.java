import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Text 1");
        map.put(2, "Text 2");
        map.put(3, "Text 3");
        map.put(4, "Text 4");
        map.put(5, "Text 5");
        map.put(5, "Text 5");
        map.put(5, "Text 5");


        for (Map.Entry m: map.entrySet()) {
            System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
        }

        Map<Double, Boolean> map1 = new HashMap<>();
        map1.put(10.0, true);
        map1.put(11.0, false);
        map1.put(12.0, false);
        map1.put(13.0, true);










    }





}
