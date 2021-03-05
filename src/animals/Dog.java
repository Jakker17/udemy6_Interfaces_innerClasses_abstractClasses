package animals;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("nam nam nam food wuf wuf wuf");
    }

    @Override
    public void breath() {
        System.out.println("human i am breathing");
    }
}
