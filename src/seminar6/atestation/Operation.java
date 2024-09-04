package seminar6.atestation;

import java.util.*;

public class Operation {

    List<Criteria> list = new ArrayList<>();
    Set<Laptop> laps = new HashSet<>();

    public Operation(Set<Laptop> laptops){
        laps = laptops;
    }
    public boolean laptopIsCorrect(Laptop laptop){
        for (Criteria criterion : list){
            Object valueNotebook = null;

            if (criterion.property.equals("Ram")){
                valueNotebook = laptop.ram;
            }else if (criterion.property.equals("Hdd")){
                valueNotebook = laptop.hdd;
            }else if (criterion.property.equals("Oc")){
                valueNotebook = laptop.oc;
            }
            else if (criterion.property.equals("color")){
                valueNotebook = laptop.color;
            }else {
                continue;
            }

            if (criterion.value != null && !criterion.value.equals(valueNotebook)){
                return false;
            }

            if (criterion.maxValue != null && criterion.maxValue < Double.parseDouble(Objects.toString(valueNotebook))){
                return false;
            }

            if (criterion.minValue != null && criterion.minValue > Double.parseDouble(Objects.toString(valueNotebook))){
                return false;
            }
        }

        return true;
    }
}
