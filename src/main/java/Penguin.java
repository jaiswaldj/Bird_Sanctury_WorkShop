public class Penguin extends Bird implements Swimmable, Eatable {
    static int count;

    public Penguin() {
    }

    public void eat() {
        System.out.println("Penguin is eating");
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
        System.out.println("Pengiun is swimming");
    }
}
