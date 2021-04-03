package geekbrains.java_core1.lesson6;

public class HomeWork6 {
    public static void main(String[] args){
        Cat c = new Cat("Bars",1000,10);
        Cat c2 = new Cat("Matroskin",100,10);
        Dog d = new Dog("Wolf",100,10);
        Animals g=new Animals("das",1,1);
        c.run(c.distanceRun);
        c.swim(c.distanceSwim);
        d.run(d.distanceRun);
        d.swim(d.distanceSwim);
        System.out.printf("Всего сздано %s животных из них %s котов и %s собак", c.count , c.catCount,d.dogCount);


    }

}
