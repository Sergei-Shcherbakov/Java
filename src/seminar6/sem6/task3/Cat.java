package seminar6.sem6.task3;

public class Cat {
    String name;
    int age;
    String paroda;
    String owner;


    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", paroda: " + paroda + ", owner: " + owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && age == cat.age && paroda.equals(cat.paroda) && owner.equals(cat.owner);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*age + 13*paroda.hashCode() + 17*owner.hashCode();
    }
}
