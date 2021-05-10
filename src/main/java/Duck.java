public class Duck extends Bird implements Flyable, Swimmable, Eatable {
    static int count;

    public Duck() {
    }

    public void fly() {
        System.out.println("Duck is flying");
    }

    public void eat() {
        System.out.println("Duck is eating fish");
    }

    public void incrementCount() {
        ++count;
    }

    void decrementCount() {
        --count;
    }

    int getCount() {
        return count;
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }
}
