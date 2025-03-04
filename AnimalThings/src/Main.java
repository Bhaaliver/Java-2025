public class Main {
    public static void main(String[] args) {
        Animal animal1  = new Dog("bob", 4, 200, "bulldog", "brown");
        animal1.sayName();
        animal1.sayPriceOptions();

        // change animal to parrot
        animal1 = new Animal("derald", 3, 50.0f);
        animal1.sayName();
        animal1.sayPriceOptions();
    }
}