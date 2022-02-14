package AnimalHierarchyExercise;

public class Wolf extends Animal implements Noisy, Mobile {
    @Override
    public String eat() {
        return "The wolf eats meat.";
    }

    public String move() {
        return "The wolf lopes.";
    }

    public String makeNoise() {
        return "The wolf howls.";
    }
}