package geekbrains.java_core1.lesson5;
//HomeWork5
public class HomeWork5 {


    public static void main(String[] args)  {

        Person[] persons = {
                new Person("Nik", "programmer", "nik@test.com", "9101111111", 100, 33),
                new Person("Eva", "programmer", "eva@test.com", "9101111111", 1000, 35),
                new Person("Jack", "programmer", "jack@test.com", "9101111111", 10000, 42),
                new Person("Anjela", "programmer", "anjela@test.com", "9101111111", 10000, 40),
                new Person("Vasya", "programmer", "vasya@test.com", "9101111111", 1000, 56)

        };

        for (Person person : persons) {
            if (person.getAge() > 40) person.getPerson();
        }
    }
}
