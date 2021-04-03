package geekbrains.java_core1.lesson6;

public class Animals {
   protected String name;
   protected int distanceRun;
   protected int distanceSwim;
   static int count;

    public Animals(String name,int distanceRun,int distanceSwim) {
        count++;
        this.name=name;
        this.distanceRun = distanceRun;
        this.distanceSwim=distanceSwim;
    }

    public void run(int distance){
        System.out.println("Enimal run "+ distance + "meters");
    }

     void swim(int distanceSwim){
        System.out.println("Enimal swim "+ distanceSwim + "meters");

    }

}