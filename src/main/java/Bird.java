public abstract class Bird {
    public Bird() {
    }

    abstract void incrementCount();

    abstract void decrementCount();

    public boolean equals(Object object) {
        return super.equals(object);
    }
}
