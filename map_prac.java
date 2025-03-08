import java.util.Hashtable;
import java.util.Map;

public class map_prac {
    public static void main(String a[]) {
        Map<String, Integer> ma = new Hashtable<>();// for creating key value pair and it works on the functionaloty of
                                                    // set(no duplicate key)
        ma.put("navin", 23);
        ma.put("navi", 3);
        ma.put("navibn", 43);
        ma.put("navin", 9023);

        System.out.println(ma);
        for (String key : ma.keySet()) {
            System.out.println(key + ":" + ma.get(key));
        }

    }

}
