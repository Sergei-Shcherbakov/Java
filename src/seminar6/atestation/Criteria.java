package seminar6.atestation;

import java.util.Scanner;

public class Criteria {

    Object value;
    Double minValue;
    Double maxValue;
    boolean isQuantitative;
    String property;

    public Criteria(String property, boolean isQuantitative, Object value, Double minValue, Double maxValue) {
        this.property = property;
        this.isQuantitative = isQuantitative;
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public static Criteria startGetting(Scanner scanner, String property, boolean isQuantitative) {

        if (isQuantitative) {

            String quest = "Выберите критерий: " +
                    "\n 1. Значение" +
                    "\n 2. Меньше чем" +
                    "\n 3. Больше чем" +
                    "\n 4. Между";
            System.out.println(quest);

            String text = scanner.next();

            Criteria criterion = null;

            if (text.equals("1")) {
                System.out.print("Введите значение для поиска: ");
                int getValue = scanner.nextInt();
                criterion = new Criteria(property, isQuantitative, getValue, null, null);
            } else if (text.equals("2")) {
                System.out.print("Введите макс максимальное значение: ");
                double getValue = scanner.nextDouble();
                criterion = new Criteria(property, isQuantitative, null, null, getValue);
            } else if (text.equals("3")) {
                System.out.print("Введите минимальное значение: ");
                double getValue = scanner.nextDouble();
                criterion = new Criteria(property, isQuantitative, null, getValue, null);
            } else if (text.equals("4")) {
                System.out.print("Введите макс максимальное значение: ");
                double getMin = scanner.nextDouble();
                System.out.print("Введите макс максимальное значение: ");
                double getMax = scanner.nextDouble();
                criterion = new Criteria(property, isQuantitative, null, getMin, getMax);
            }

            return criterion;
        }

        System.out.print("Введите значение для поиска: ");
        String getValue = scanner.next();
        return new Criteria(property, isQuantitative, getValue, null, null);
    }
}
