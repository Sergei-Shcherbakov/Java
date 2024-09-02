package seminar5.sem5.task1;
//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//Вывести данные по сотрудникам с фамилией Иванов.
public class Task1 {
    public static void main(String[] args) {
        Employer em = new Employer();
        em.add("123456", "Иванов");
        em.add("321456", "Васильев");
        em.add("234561", "Петрова");
        em.add("234432", "Иванов");
        em.add("654321", "Петрова");
        em.add("345678", "Иванов");
        System.out.println(em);
        System.out.println(em.findByName("Иванов"));
        em.remove("321456");
        System.out.println(em);


    }
}
