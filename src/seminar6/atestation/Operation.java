package seminar6.atestation;

import java.util.*;

public class Operation {
    List<Criteria> list = new ArrayList<>();
    Set<Laptop> laps = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    public Operation(Set<Laptop> laptops){
        this.scanner = new Scanner(System.in);
        laps = laptops;
    }

    private void printLaptops() {
        List<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop l : laps) {
            if (laptopIsCorrect(l)){
                filteredLaptops.add(l);
            }
        }

        if (!filteredLaptops.isEmpty()){
            for (Laptop l : filteredLaptops){
                System.out.println(l.toString());
            }
        } else {
            System.out.println("\n======== Нет подходящих устройств ========\n");
        }
    }

    private boolean laptopIsCorrect(Laptop laptop){
        for (Criteria criterion : list){
            Object valueNotebook = null;

            if (criterion.property.equals("ОЗУ")){
                valueNotebook = laptop.ram;
            }else if (criterion.property.equals("Объем ЖД")){
                valueNotebook = laptop.hdd;
            }else if (criterion.property.equals("Ос")){
                valueNotebook = laptop.oc;
            }
            else if (criterion.property.equals("Цвет")){
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

    private int getCriteria(){
        String text = "Введите номер критерия";

        List<String> properties = propertiesForFilter();

        for (int i = 0; i < properties.size(); i++) {
            text += "\n" + (i + 1) + ". " + getPropertyDescription(properties.get(i));
        }

        text += "\nКритерий: ";

        System.out.print(text);

        return scanner.nextInt();
    }

    private String getPropertyDescription(String property){
        Map<String, String> dProperties = descriptionsProperties();

        return dProperties.get(property);
    }

    private Map<String, String> descriptionsProperties() {
        Map<String, String> descriptions = new HashMap<>();

        descriptions.put("ОЗУ", "ОЗУ");
        descriptions.put("Объем ЖД", "Объем ЖД");
        descriptions.put("Ос", "Ос");
        descriptions.put("Цвет", "Цвет");

        return descriptions;
    }

    private List<String> propertiesForFilter() {
        List<String> properties = new ArrayList<>();

        properties.add("ОЗУ");
        properties.add("Объем ЖД");
        properties.add("Ос");
        properties.add("Цвет");

        return properties;
    }

    private String getOperations(){
        String text = "Введите номер действия\n" +
                "1 - Добавить критерий\n" +
                "2 - Вывести результат\n" +
                "3 - Закончить\n" +
                "Действие: ";

        System.out.print(text);

        return scanner.next();
    }

    private Set<String> quantitativeSelection(){
        Set<String> set = new HashSet<>();

        set.add("ОЗУ");
        set.add("Объем ЖД");

        return set;
    }

    public void Process() {
        boolean falg = true;
        while (falg) {
            String operation = getOperations();
            if(operation.equals("3")){
                falg = false;
                scanner.close();
                continue;
            } else if (operation.equals("1")) {
                int criteria = getCriteria();
                List<String> properties = propertiesForFilter();
                if (criteria - 1 < 0 || criteria - 1 > properties.size() - 1) {
                    System.out.println("Введенное значение некорректно");
                    continue;
                }
                String property = properties.get(criteria - 1);
                Criteria criteriaObj = null;
                try {
                    if(quantitativeSelection().contains(property)){
                        criteriaObj = Criteria.startGetting(scanner, property, true);
                    } else {
                        criteriaObj = Criteria.startGetting(scanner, property, false);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                if (criteriaObj != null) {
                    System.out.println("Критерий был добавлен в фильтр");
                    list.add(criteriaObj);
                }
            } else if (operation.equals("2")) {
                printLaptops();
            }
        }
    }
}

