public class BirdFactory {

    enum BirdType{
        PARROT, DUCK, PENGUIN, TOYDUCK;
    }

    private static BirdFactory instance;

    private BirdFactory() {}

    public static synchronized BirdFactory getInstance() {
        if(instance == null) {
            instance = new BirdFactory();
        }
        return instance;
    }

    public Bird getBird(BirdType bird) {
        switch (bird) {
            case PARROT:
                return new Parrot();

            case PENGUIN:
                return new Penguin();

            case DUCK:
                return new Duck();

            case TOYDUCK:
                return new ToyDuck();

            default:
                return null;
        }
    }
}
