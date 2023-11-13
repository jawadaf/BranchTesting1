public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Wuff");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood() {
        System.out.println("ang");
    }
}
