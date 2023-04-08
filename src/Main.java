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
        Collections.sort(people, (o1, o2) ->
        {
            int length1 = o1.getSurname().split("-").length;
            int length2 = o2.getSurname().split("-").length;
            if (length1 < length2) {
                return -1;
            }

            if (length1 > length2) {
                return 1;
            }
            return o1.getAge() - o2.getAge();
        });
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}