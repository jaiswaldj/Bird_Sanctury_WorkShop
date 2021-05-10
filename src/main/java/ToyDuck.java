public class ToyDuck extends Bird implements Flyable, Swimmable {
    static int count;

    public ToyDuck() {
    }

    void incrementCount() {
        ++count;
    }

    void decrementCount() {
        --count;
    }

    int getCount() {
        return count;
    }

    public void fly() {
        System.out.println("I am toy Duck and I can fly");
    }

    public void swim() {
        System.out.println("I am toy Duck and I can swim");
    }
}
