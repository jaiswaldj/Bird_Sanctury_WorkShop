public class Parrot extends Bird implements Flyable, Eatable {
    static int count;

    public Parrot() {
    }

    public void fly() {
        System.out.println("Parrot is flying");
    }

    public void eat() {
        System.out.println("Parrot is eating fruits");
    }

    public void incrementCount() {
        ++count;
    }

    int getCount() {
        return count;
    }

    void decrementCount() {
        --count;
    }
}
