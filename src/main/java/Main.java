public class Main {

    public static void main(String[] args) throws Exception {

        BirdSanctuary birdSanctuary = BirdSanctuary.getInstance();
        BirdFactory birdFactory = BirdFactory.getInstance();

        Penguin firstPenguin = (Penguin) birdFactory.getBird(BirdFactory.BirdType.PENGUIN);
        Duck firstDuck = (Duck) birdFactory.getBird(BirdFactory.BirdType.DUCK);
        Parrot firstParrot = (Parrot) birdFactory.getBird(BirdFactory.BirdType.PARROT);
        Duck newDuck = (Duck) birdFactory.getBird(BirdFactory.BirdType.DUCK);
        ToyDuck toyDuck = (ToyDuck)  birdFactory.getBird(BirdFactory.BirdType.TOYDUCK);
        Parrot nullParrot = null;

        birdSanctuary.add(firstDuck);
        birdSanctuary.add(firstParrot);
        birdSanctuary.add(firstPenguin);
        birdSanctuary.add(newDuck);
        birdSanctuary.add(toyDuck);
        birdSanctuary.add(toyDuck);
        birdSanctuary.add((Bird)nullParrot);
        birdSanctuary.remove(newDuck);
        birdSanctuary.eatable();
        birdSanctuary.swimmable();
        birdSanctuary.flyable();

        System.out.println("Count of Ducks in bird sanctuary: " + Duck.count);
        System.out.println("Count of Parrots in bird sanctuary: " + Parrot.count);
        System.out.println("Count of Penguins in bird sanctuary: " + Penguin.count);
        System.out.println("Count of ToyDuck in bird sanctuary: " + ToyDuck.count);
    }
}
