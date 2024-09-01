package seminar5.les5;

import java.util.HashMap;
import java.util.Map;

public class T1 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.putIfAbsent(1,"один");
        m.put(2,"два");
        m.put(null,null);
        System.out.println(m);
        System.out.println(m.get(44));
//        m.remove(null);
        System.out.println(m);
        System.out.println(m.containsValue("один"));
        System.out.println(m.containsKey(1));
        System.out.println(m.keySet());
        System.out.println(m.values());
    }
}
