package seminar6.les6;

public class Worker {
    int id;
    int salary;
    String fistName;
    String  lastName;

    @Override
    public String toString() {
        return String.format("id:%d fn:%s ln:%s s:%d", id, fistName, lastName,salary);

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Worker t = (Worker) obj ;
        return id == t.id && fistName == t.fistName;
    }
}
