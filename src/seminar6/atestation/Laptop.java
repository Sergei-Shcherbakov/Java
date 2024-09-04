package seminar6.atestation;

import seminar6.sem6.task3.Cat;

public class Laptop {
    int ram;
    int hdd;
    String oc;
    String color;

    public Laptop(int ram, int hdd, String oc, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.oc = oc;
        this.color = color;
    }


    @Override
    public String toString() {
        return "ОЗУ: " + ram + " Гб" + ", Объем ЖД: " + hdd + " Мб" + ", Операционная система: " + oc + ", Цвет: " + color;
    }

}
