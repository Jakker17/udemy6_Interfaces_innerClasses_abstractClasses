package animals;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("shepard");
        dog.breath();
        dog.eat();
        System.out.println();


        Parrot parrot = new Parrot("zoe");
        parrot.eat();
        parrot.breath();
        parrot.fly();
        System.out.println();

        Penguin penguin = new Penguin("artie");
        penguin.eat();
        penguin.breath();
        penguin.fly();
        System.out.println(penguin.getName());
    }
}
