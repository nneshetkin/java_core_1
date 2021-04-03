package geekbrains.java_core1.lesson6;

public class Dog extends Animals{
    static int dogCount;
    public Dog(String name, int distance,int distanceSwim) {
        super(name, distance,distanceSwim);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance>500) System.out.println("Собаки не могу столько бегать");
        else System.out.println(this.name+ " пробежал "+distance+ " метров");
    }

    @Override
    void swim(int distanceSwim) {
        if (distanceSwim>10)
        System.out.println(this.name+" не сможет столько проплыть");
        else System.out.println(this.name+ " проплыл "+distanceSwim+ " метров");
    }
}
