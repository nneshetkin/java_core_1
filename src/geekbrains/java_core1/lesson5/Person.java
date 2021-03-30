package geekbrains.java_core1.lesson5;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Person(String fio, String position, String email, String telephone, int salary,int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age=age;
    }
    public void getPerson(){
        System.out.printf("FIO: %s Position: %s Email: %s Telephone: %s Salary: %s Age: %s\n" ,fio,position,email, telephone,salary,age);

    }

    public int getAge(){
        return age;
    }
}




