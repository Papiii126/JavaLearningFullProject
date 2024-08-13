package rozdzial2.zajecia_dodatkowe2_polimorfizm;

public class main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Bird bird = new Bird();
        Dog dog = new Dog();

//        // Mammal cat = new Cat(); -> w tym momencie mamy tylko dostęp do metod z interfejsu Mammal czyli: sleep i wake up.
//        Animal cat = new Cat();
//        Animal bird = new Bird(); // tu w obu przypadkach możemy wykorzystać wszystkie meteody z interfejsu Animal

        // Cat[] animals = {cat, dog, bird}; -> to nie zadziała a dzięki poliformizmowi możemy ujednolocić do Animal, ponieważ
        // wszystkie dziedziczą po interfejsie Animal

        Animal[] animals = {cat, dog, bird};
        for (Animal animal : animals){
            showAnimalInfo(animal);
            System.out.println("--------------");
        }

        showAnimalInfo(cat);
        System.out.println("--------------");
        showAnimalInfo(bird);
        System.out.println("--------------");
        showAnimalInfo(dog);
    }

    private static void showAnimalInfo(Animal animal) {
        System.out.println(animal.getType());
        animal.talk();
        System.out.println(animal.getSumOfLegs());
        animal.sleep();
        animal.wakeUp();
    }
}
