package geekbrains.java_core1.lesson7;

public class CatBowl extends AbstractBowl {

    @Override
    public void put(int amount) {
        super.put(amount);
        System.out.printf("Food put for %d, and %d left\n", amount, this.amount);
    }

    @Override
    public int decrease(int amount) {
        int rest;
        rest=this.amount;
        this.amount -= amount;
       if  (this.amount>=0) {
           System.out.printf("Food decreased for %d, and %d left\n", amount, this.amount);
           return amount;
       }
        else System.out.println("left only "+ rest);return 0;
       }

}
