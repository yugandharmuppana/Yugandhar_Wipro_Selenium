package Day6_assignment;

class MyAnimal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends MyAnimal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        MyAnimal a = d;
        a.makeSound();
    }
}
