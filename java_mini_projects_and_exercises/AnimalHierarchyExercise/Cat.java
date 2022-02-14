package AnimalHierarchyExercise;

public class Cat extends Animal implements Noisy, Mobile, Pet {
    public String makeNoise() {
        return "The cat says meow.";
    }
    
    public String move() {
        return "The cat slinks along.";
    }
    
    @Override
    public String eat() {
        return "The cat eats fish.";
    }

    public String patThePet() {
        return "The cat purrs.";
    }
}