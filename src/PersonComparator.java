import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{


    public int compare(Person o1, Person o2) {
        if (Name(o1) < Name(o2)) {
            return -1;
        }

        if (Name(o1) > Name(o2)) {
            return 1;
        }
        return o1.getAge() - o2.getAge();
    }

    private int Name(Person person) {
        String surname = person.getSurname();
        return surname.split("-").length;


    }}




