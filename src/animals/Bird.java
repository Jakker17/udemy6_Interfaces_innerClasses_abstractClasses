package animals;

public abstract class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("i eat only vegetables");
    }

    @Override
    public void breath() {
        System.out.println("you cant see it but i am doing it.");
    }

    public abstract void fly();
}
