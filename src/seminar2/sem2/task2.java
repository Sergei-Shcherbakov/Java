package seminar2.sem2;
//Напишите метод, который сжимает строку.
//        Пример: вход aaaabbbcdd.
//        Результат: a4b3cd2
public class task2 {
    public static void main(String[] args) {

        String n = "aaabbbcdddddd";

        System.out.println(st(n));
    }

    static String st (String n){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char cur = n.charAt(0);
        for (int i = 0; i < n.length(); i++) {
            char item = n.charAt(i);
            if (item == cur){
                count++;
            }
            else {
                sb.append(cur);
                if (count > 1){
                    sb.append(count);
                    count = 1;
                }
                cur = item;
            }


        }
        sb.append(cur);
        if (count > 1) {
            sb.append(count);
        }
        return sb.toString();
    }
}
