package geekbrains.java_core1.lesson7;

public class PrettyDish extends AbstractBowl {

    @Override
    public void put(int amount) {
        super.put(amount);
        System.out.printf("DISH: Food put for %d, and %d left\n", amount, this.amount);
    }

    @Override
    public int decrease(int amount) {
        super.decrease(amount);
        System.out.printf("DISH: Food decreased for %d, and %d left\n", amount, this.amount);
    return amount;
    }

}