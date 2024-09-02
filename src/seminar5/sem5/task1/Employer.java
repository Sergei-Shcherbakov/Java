package seminar5.sem5.task1;

import java.util.*;

public class Employer {
    private Map<String,String> map = new HashMap<>();

    public void add(String passport,String name){
        map.put(passport,name);
    }

    public String findByName(String name){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String,String> entry: map.entrySet()) {
            if (entry.getValue() == "Иванов"){
                sb.append(entry.getKey() + " " + entry.getValue() + "\n");
            }
        }
        return sb.toString();
    }

    public boolean remove(String passport){
        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            if (iter.next().getKey().equals(passport)){
                iter.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "map=" + map +
                '}';
    }
}
