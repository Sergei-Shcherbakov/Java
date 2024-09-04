package seminar6.atestation;

import seminar6.sem6.task3.Cat;

public class Laptop {
    int ram;
    int hdd;
    String oc;
    String color;

    public Laptop (int ram, int hdd, String oc, String color){
        this.ram = ram;
        this.hdd = hdd;
        this.oc = oc;
        this.color = color;
    }


    @Override
    public String toString() {
        return "ОЗУ: " + ram + " Гб" + ", Объем ЖД: " + hdd + " Мб" + ", Операционная система: " + oc + ", Цвет: " + color;
    }

//    public boolean equals1(Object obj) {
//        if (this == obj){
//            return true;
//        }
//        if (!(obj instanceof Laptop)){
//            return false;
//        }
//        Laptop laptop = (Laptop) obj;
//        return ram == laptop.ram && hdd == laptop.hdd && oc.equals(laptop.oc) && color.equals(laptop.color);
//    }
//
//    @Override
//    public int hashCode() {
//        return ram + 7*hdd + 13*oc.hashCode() + 17*color.hashCode();
//    }
}
