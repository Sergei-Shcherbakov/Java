package seminar1.sem1;

//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
public class Task4 {
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по Java";
        String [] words = s.split(" ");
        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
