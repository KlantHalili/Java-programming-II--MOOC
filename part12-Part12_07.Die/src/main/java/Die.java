import java.util.Random;

public class Die {
    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces; // ✅ Store the number of sides
    }

    public int throwDie() {
        // ✅ Generate a number between 1 and numberOfFaces (inclusive)
        return this.random.nextInt(this.numberOfFaces) + 1;
    }
}
