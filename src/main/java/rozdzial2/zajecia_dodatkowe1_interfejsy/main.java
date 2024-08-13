package rozdzial2.zajecia_dodatkowe1_interfejsy;

public class main {
    public static void main(String[] args) {

        // Cat cat = new Cat(); -> typowe wywołanie
        // Bird bird = new Bird();

        // Mammal cat = new Cat(); -> w tym momencie mamy tylko dostęp do metod z interfejsu Mammal czyli: sleep i wake up.
        Animal cat = new Cat();
        Animal bird = new Bird(); // tu w obu przypadkach możemy wykorzystać wszystkie meteody z interfejsu Animal

        System.out.println("Cat");
        cat.talk();
        System.out.println(cat.getSumOfLegs());
        cat.sleep();
        cat.wakeUp();
        System.out.println("--------------");
        System.out.println("Bird");
        bird.talk();
        System.out.println(bird.getSumOfLegs());
        bird.sleep();
        bird.wakeUp();
    }
}
