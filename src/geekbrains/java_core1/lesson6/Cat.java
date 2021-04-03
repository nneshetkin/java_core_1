package geekbrains.java_core1.lesson6;

public class Cat extends Animals {
    static int catCount;

    public Cat(String name, int distance,int distanceSwim) {
        super(name, distance,distanceSwim);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance>200) System.out.println("Коты не могут столько бегать потому что лапки маленьки");
        else System.out.println(this.name+ " пробежал "+distance+ " метров");
    }

    @Override
    void swim(int distanceSwim) {
        System.out.println("Коты не умеют плавать");
    }
}
