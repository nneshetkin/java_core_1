package geekbrains.java_core1.lesson7;

public abstract class AbstractBowl {
    protected int amount;

    public void put(int amount) {
        this.amount += amount;
    }
    public int decrease(int amount) {
        this.amount -= amount;
        return amount;
    }

    public int getAmount() {
        return amount;
    }
}