package seminar1.dz1.task2;

class Answer1 {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        int count;
        for (int i = 2; i < 1001; i++) {
            count = 0;
            for (int j = 2; j < i+1 ; j++) {
                if (i%j==0) count++;
            }
            if (count==1) System.out.println(i);
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer2{
    public static void main(String[] args) {

        Answer1 ans = new Answer1();
        ans.printPrimeNums();
    }
}