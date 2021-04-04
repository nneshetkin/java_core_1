package geekbrains.java_core1.lesson7;

public class DogBowl extends AbstractBowl {

    @Override
    public void put(int amount) {
        super.put(amount);
        System.out.printf("DOG BOWL: Food put for %d, and %d left\n", amount, this.amount);
    }

    @Override
    public int decrease(int amount) {
        super.decrease(amount);
        System.out.printf("DOG BOWL: Food decreased for %d, and %d left\n", amount, this.amount);
    return amount;
    }

}
