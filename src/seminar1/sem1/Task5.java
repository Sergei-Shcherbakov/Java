package seminar1.sem1;

//Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//        Пример 1: а = 3, b = 2, ответ: 9
//        Пример 2: а = 2, b = -2, ответ: 0.25
//        Пример 3: а = 3, b = 0, ответ: 1
public class Task5 {
    public static void main(String[] args) {
        double a = 0.5;
        int b = 3;
        System.out.println(pow(a,b));
    }
    static double pow(double a, int b){
        if (b==0 || a==1) return 1;
        if (b<0) {
            a = 1.0 / a;
            b = -b;
        }
        double res = a;
        for (int i = 1; i < b ; i++) {
            res = res * a;
        }
        return res;
    }
}

