package seminar6.les6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class T2 {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.fistName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.fistName = "Имя_1";
        w4.lastName = "Фамилия_2";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.fistName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 1000;
        w2.id = 3000;

        Worker w3 = new Worker();
        w3.fistName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 2000;
        w3.id = 2000;

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
    }
}
