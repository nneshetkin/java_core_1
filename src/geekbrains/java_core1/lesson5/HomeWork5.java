package geekbrains.java_core1.lesson5;
//HomeWork5
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4. Создать массив из 5 сотрудников.
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
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
