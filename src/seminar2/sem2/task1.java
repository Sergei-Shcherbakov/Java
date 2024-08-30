package seminar2.sem2;
// Дано четное число N (>0) и символы c1 и c2.
//         Написать метод, который вернет строку длины N,
//         которая состоит из чередующихся символов c1 и c2, начиная с c1.
//         Ответ: c1c2c1…c2 (всего N символов)
public class task1 {
    public static void main(String[] args){
        int n = 4;
        StringBuilder a = new StringBuilder();
        for (int i = 0;i < n;i++){
            if (i % 2 == 0) a.append("c1");
            else a.append("c2");
        }
        System.out.println(a);


    }
}
