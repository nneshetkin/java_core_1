package geekbrains.java_core1.lesson7;

import javax.swing.*;
import java.awt.*;

public class HomeWork7 {
    public static void main(String[] args){
        Cat[] cats={
                new Cat("Barsik", 15,false),
                new Cat("Murzik", 12,false),
                new Cat("Vaska", 8,false)
        };
        CatBowl catBowl = new CatBowl();
        catBowl.put(30);
        for (Cat cat : cats) {
            cat.eat(catBowl);
        }
//
//        Cat c = new Cat("Barsik" , 10,false);
//        System.out.println(c);
//        bowlsEx();
//        AbstractBowl a = new AbstractBowl() {
//            @Override
//            public void put(int amount) {
//                super.put(amount);
//            }
//        };



    }
//    private static void bowlsEx() {
//        Cat c = new Cat("Barsik", 15,false);
//        AbstractBowl[] bowls = {
//                new CatBowl()
//        };
//
//        for (AbstractBowl bowl : bowls) {
//            bowl.put(50);
//            c.eat(bowl);
//        }
//    }

}
