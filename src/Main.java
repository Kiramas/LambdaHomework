import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Николас", "де Буа", 33));
        people.add(new Person("Анатолий", "Печкин", 76));
        people.add(new Person("Анна", "Смирнова-Козицына", 21));
        people.add(new Person("Евгений", "Мирнов", 120));
        Comparator persons = new PersonComparator();
        Collections.sort(people, persons);
        for (Person p : people) {
            System.out.println(p.toString());
        }


    }}