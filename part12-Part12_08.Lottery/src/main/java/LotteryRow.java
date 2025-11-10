
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        this.random = new Random();
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        while(this.numbers.size()<7){
            
            int n = this.random.nextInt(40)+1;
            if((!this.containsNumber(n))){
            this.numbers.add(n);
        }
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)){
            return true;
        }
        // Check here whether the number is among the drawn numbers
        return false;
    }
}

