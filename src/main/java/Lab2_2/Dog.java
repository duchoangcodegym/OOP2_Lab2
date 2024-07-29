package Lab2_2;

public class Dog extends  Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The dog barks");
    }
}
