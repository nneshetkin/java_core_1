package geekbrains.java_core1.lesson7;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite,boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness=fullness;

   //     System.out.println("Cat constructor!");
    }

    public void eat(AbstractBowl bowl) {
        if (bowl.decrease(appetite)>0){
        System.out.printf("Cat %s ate some food and is full\n", this.name);
        setFullness(true);
        //System.out.println(fullness);
        }
        else System.out.printf("Cat %s not food and is not full\n", this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setFullness(boolean fullness) {
        this.fullness=fullness;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", fullness=" + fullness +
                '}';
    }
}