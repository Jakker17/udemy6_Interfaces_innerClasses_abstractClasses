package animals;

public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("give me some carrot");
    }

    @Override
    public void fly() {
        System.out.println("I am good at that.");
    }
}
