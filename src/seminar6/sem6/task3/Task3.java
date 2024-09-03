package seminar6.sem6.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();

        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.age = 10;
        cat1.paroda = "Сфинкс";
        cat1.owner = "Иван Иванович";

        Cat cat2 = new Cat();
        cat2.name = "Мурзик";
        cat2.age = 9;
        cat2.paroda = "Британец";
        cat2.owner = "Мария Ивановна";

        Cat cat3 = new Cat();
        cat3.name = "Машка";
        cat3.age = 11;
        cat3.paroda = "Сибирская";
        cat3.owner = "Петр Семенович";

        Cat cat4 = new Cat();
        cat4.name = "Жорик";
        cat4.age = 10;
        cat4.paroda = "Перс";
        cat4.owner = "Кирилл Иванович";

        Cat cat5 = new Cat();
        cat5.name = "Жорик";
        cat5.age = 10;
        cat5.paroda = "Перс";
        cat5.owner = "Кирилл Иванович";

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

//        System.out.println(cats);
        print(cats);

        System.out.println(cat5.equals(cat4));

        print(selectByAge(cats, 10));


    }

    static Set<Cat> selectByAge(Set<Cat> cats , int minAge){
        Set<Cat> set = new HashSet<>();
        for (Cat cat: cats){
            if(cat.age >= minAge){
                set.add(cat);
            }
        }
        return set;
    }

    static void print(Set<Cat> cats){
        for (Cat cat:cats) {
            System.out.println(cat);
        }

    }
}
