package seminar1.dz1.task1;
class Answer {
    public int countNTriangle(int n) {
        // Введите свое решение ниже
        if (n == 1) return 1;
        if (n > 1) return n + countNTriangle(n - 1);
        return n;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer1{
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 5;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}