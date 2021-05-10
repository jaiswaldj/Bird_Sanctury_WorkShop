import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BirdSanctuary {
    private Set<Bird> allBirds = new HashSet();
    static BirdSanctuary instance;

    private BirdSanctuary() {
    }

    public static synchronized BirdSanctuary getInstance() {
        if (instance == null) {
            instance = new BirdSanctuary();
        }

        return instance;
    }

    public void add(Bird bird) throws Exception {
        boolean var2 = this.allBirds.stream().anyMatch((i) -> {
            return i.equals(bird);
        });

        try {
            if (bird == null) {
                throw new BirdSanctuaryAddException("Bird is null");
            }

            if (this.allBirds.add(bird)) {
                bird.incrementCount();
            }
        } catch (BirdSanctuaryAddException var4) {
            var4.printStackTrace();
        }

    }

    public void remove(Bird bird) {
        this.allBirds.remove(bird);
        bird.decrementCount();
    }

    public void eatable() {
        this.allBirds.stream().filter((bird) -> bird instanceof Eatable).forEach((b) -> ((Eatable) b).eat());
    }

    public void swimmable() {
//        Iterator var1 = this.allBirds.iterator();
//
//        while(var1.hasNext()) {
//            Bird bird = (Bird)var1.next();
//            if (bird instanceof Swimmable) {
//                ((Swimmable)bird).swim();
//            }
//        }
        this.allBirds.stream().filter((bird) -> bird instanceof Swimmable).forEach((b) -> ((Swimmable) b) .swim());
    }

    public void flyable() {
//        Iterator var1 = this.allBirds.iterator();
//
//        while(var1.hasNext()) {
//            Bird bird = (Bird)var1.next();
//            if (bird instanceof Flyable) {
//                ((Flyable)bird).fly();
//            }
//        }
        this.allBirds.stream().filter((bird) -> bird instanceof Flyable).forEach((b) -> ((Flyable) b) .fly());
    }
}
