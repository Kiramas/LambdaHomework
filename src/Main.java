import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Николас", "де Буа", 13));
        people.add(new Person("Анатолий", "Печкин", 16));
        people.add(new Person("Анна", "Смирнова-Козицына", 21));
        people.add(new Person("Евгений", "Мирнов", 120));
        people.removeIf(person -> person.getAge() < 18);
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}