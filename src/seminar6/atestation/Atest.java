package seminar6.atestation;

import seminar6.sem6.task3.Cat;

import javax.swing.*;
import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
//Работу сдать как обычно ссылкой на гит репозиторий
//Частые ошибки:
//1. Заставляете пользователя вводить все существующие критерии фильтрации
//2. Невозможно использовать более одного критерия фильтрации одновременно
//3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
//4. Работа выполнена только для каких то конкретных ноутбуков,
// и если поменять характеристики ноутбуков или добавить еще ноутбук, то программа начинает работать некорректно
public class Atest {
    public static void main(String[] args) {
//        Set<Set<Laptop>> set1 = new HashSet<>();
        Set<Laptop> laps = new HashSet<>();

        Laptop lap1 = new Laptop(8, 1000, "Widows", "черный");
        Laptop lap2 = new Laptop(4, 500, "Linux", "белый");
        Laptop lap3 = new Laptop(8, 250,"Mac","серый");
        Laptop lap4 = new Laptop(16, 1000, "Windows", "черный");

        laps.add(lap1);
        laps.add(lap2);
        laps.add(lap3);
        laps.add(lap4);

        ssss(laps,set1);
        Operation operation = new Operation(laps);

    }



    static void print(Set<Set<Laptop>> set1) {
        for (Set<Laptop> set : set1) {
            for (Laptop lap: set){
                System.out.println(lap);
            }
        }
    }

    static Set<Laptop> selectByRam(Set<Laptop> laps, int minRam) {
        Set<Laptop> set = new HashSet<>();
        for (Laptop lap : laps) {
            if (lap.ram >= minRam) {
                set.add(lap);
            }
        }
        return set;
    }

    static Set<Laptop> selectByHdd(Set<Laptop> laps, int selectHdd) {
        Set<Laptop> set = new HashSet<>();
        for (Laptop lap : laps) {
            if (lap.hdd >= selectHdd) {
                set.add(lap);
            }
        }
        return set;
    }

    static Set<Laptop> selectByOc(Set<Laptop> laps, String selectOc) {
        Set<Laptop> set = new HashSet<>();
        for (Laptop lap : laps) {
            if (lap.oc.toLowerCase().equals(selectOc.toLowerCase())) {
                set.add(lap);
            }
        }
        return set;
    }

    static Set<Laptop> selectByColor(Set<Laptop> laps, String selectColor) {
        Set<Laptop> set = new HashSet<>();
        for (Laptop lap : laps) {
            if (lap.color.toLowerCase().equals(selectColor.toLowerCase())) {
                set.add(lap);
            }
        }
        return set;
    }


    static void ssss(Set<Laptop> laps, Set<Set<Laptop>> set1) {
        boolean work = true;
        while (work) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("5 - Поиск");
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            String s = scan.nextLine();
            boolean work1 = true;
            while (work1) {
                if (s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")) {
                    work1 = false;
                } else {

                    System.out.println("1 - ОЗУ");
                    System.out.println("2 - Объем ЖД");
                    System.out.println("3 - Операционная система");
                    System.out.println("4 - Цвет");
                    System.out.println("5 - Поиск");
                    System.out.println("Введите цифру, соответствующую необходимому критерию:");
                    s = scan.nextLine();
                }

            }

            if (s.equals("1")) {
                System.out.println("Введите минимальное значение ОЗУ, Гб:");
                s = scan.nextLine();
                int n = Integer.parseInt(s);
                set1.clear();
                if (set1.isEmpty()){
                    set1.add(selectByRam(laps, n));
                }
                ssss(laps, set1);

            }
            else if (s.equals("2")) {
                System.out.println("Введите минимальное Объем ЖД, Мб:");
                s = scan.nextLine();
                int n = Integer.parseInt(s);
                set1.clear();
                if (set1.isEmpty()){
                    set1.add(selectByHdd(laps, n));
                }
                ssss(laps,set1);
            }
            else if (s.equals("3")) {
                System.out.println("Выберите операционную систему: Windows, Mac или Linux");
                s = scan.nextLine().toLowerCase();
                boolean work2 = true;
                while (work2) {
                    if (s.equals("Windows".toLowerCase())) {
                        work2 = false;
                    } else if (s.equals("Mac".toLowerCase())) {
                        work2 = false;
                    } else if (s.equals("Linux".toLowerCase())) {
                        work2 = false;
                    } else {
                        System.out.println("Выберите операционную систему: Windows, Mac или Linux");
                        s = scan.nextLine().toLowerCase();
                    }

                }
                Set<Laptop> lapsOc = selectByOc(laps, s);
                set1.add(lapsOc);
                ssss(laps,set1);
            }
            else if (s.equals("4")) {
                System.out.println("Выберите цвет: черный, белый или серый");
                s = scan.nextLine();
                boolean work3 = true;
                while (work3) {
                    if (s.equals("черный".toLowerCase())) {
                        work3 = false;
                    } else if (s.equals("белый".toLowerCase())) {
                        work3 = false;
                    } else if (s.equals("серый".toLowerCase())) {
                        work3 = false;
                    } else {
                        System.out.println("Выберите операционную систему: Windows, Mac или Linux");
                        s = scan.nextLine().toLowerCase();
                    }

                }
                Set<Laptop> lapsColor = selectByColor(laps, s);
                set1.add(lapsColor);
                ssss(laps, set1);
            }
            else {
                if (laps.isEmpty()) {
                    System.out.println("Ноутбука нет в наличие");
                } else {
                    if (set1.isEmpty()){
                        set1.add(laps);
                        print(set1);
                    }
                    else {
                        print(set1);
                    }
                }

            }
            work = false;
        }

    }
}
//
////    static String select(String  s){
////        StringBuilder st = new StringBuilder();
////        if(s.equals("1")){
////            System.out.println("Выберете ОЗУ:");
////            System.out.println(selectMap()); // возращают сюда значения
////            if (st.isEmpty())
////
////
////            selectRam1();
////            // если выбора не было возращаем что выбрал
////            // если выбор был возращаем выбор до + выбор
////
////
////        }
////        else if (s.equals("2")) {
////            System.out.println("Объем ЖД:");
////            System.out.println(selectMap());// возращают сюда значения
////            // функция выбора озу
////            // если выбора не было возращаем что выбрал
////            // если выбор был возращаем выбор до + выбор
////        }
////        else if (s.equals("3")) {
////            System.out.println("Выберете Операционная систему:");
////            System.out.println(selectMap());// возращают сюда значения
////            // функция выбора озу
////            // если выбора не было возращаем что выбрал
////            // если выбор был возращаем выбор до + выбор
////        }
////        else if (s.equals("4")) {
////            System.out.println("Выберете цвет:");
////            System.out.println(selectMap());// возращают сюда значения
////            // функция выбора озу se
////            // если выбора не было возращаем что выбрал
////            // если выбор был возращаем выбор до + выбор
////        }
////        else if (s.equals("5")){
////            // функция поиска
////        }
////        return null ;
////    }
////    static String selectMap(Map<String,List> map, String s){
////        StringBuilder st = new StringBuilder();
////        if(s.equals("1")){
////            for (int i = 0; i < map.get("Озу").size(); i++) {
////                st.append(map.get("Озу").get(i));
////            }
////            return st.toString();
////        }
////        else if (s.equals("2")) {
////            for (int i = 0; i < map.get("Жд").size(); i++) {
////                st.append(map.get("Озу").get(i));
////            }
////            return st.toString();
////        }
////        else if (s.equals("3")) {
////            for (int i = 0; i < map.get("Ос").size(); i++) {
////                st.append(map.get("Озу").get(i));
////            }
////            return st.toString();
////        }
////        else if (s.equals("4")) {
////            for (int i = 0; i < map.get("Цвет").size(); i++) {
////                st.append(map.get("Озу").get(i));
////            }
////            return st.toString();
////        }
////
////        return null;
////    }
////
////    static Integer selectRam1(List<Integer> list){
////        Scanner scanner = new Scanner(System.in);
////        String s = scanner.nextLine();
////        int n = Integer.parseInt(s);
////        for (int i = 0; i < list.size(); i++) {
////            if (n == list.get(i)){
////                return list.get(i);
////            }
////        }
////        return 0;
////    }
//}
