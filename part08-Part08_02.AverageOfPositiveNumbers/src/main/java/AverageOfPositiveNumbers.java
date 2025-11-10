
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> pozitivet = new ArrayList<>();
        
        while (true){
            int input = scanner.nextInt();
            if(input == 0){
                int total = 0;
                if(pozitivet.isEmpty()){
                    System.out.println("Cannot calculate the average");
                } else {
                    for (int i: pozitivet){
                        total += i;
                    }
                    System.out.println(1.0*total/pozitivet.size());
                }
                break;
            } else if (input > 0){
                pozitivet.add(input);
            }
        }
    }
}
