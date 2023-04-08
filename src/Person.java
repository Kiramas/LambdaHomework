public class Person {
    private String name;
    private String surname;
    private int age;

    // создайте конструктор на все поля
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // создайте геттеры и сеттеры
    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public int setAge() {
        return age;
    }

    // создайте toString
    @Override
    public String toString() {
        return "Персона " + "\n"
                + "Фамилия = " + getSurname() + "\n"
                + "Имя    = " + getName() + "\n"
                + "Возраст    = " + getAge() + "\n"
                + "\n";
    }
}