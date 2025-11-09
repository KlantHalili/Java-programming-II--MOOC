
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> inputet = new ArrayList<>();
        // test your method here
        while(true){
            int n = scanner.nextInt();
            if(n == 0){
                break;
            } else {
                inputet.add(n);
            }
        }
        System.out.println(positive(inputet));

    }
    
    public static List <Integer> positive (List<Integer> numbers){
        ArrayList<Integer> numrat = numbers.stream()
                .filter(s -> s>0)
                .collect(Collectors.toCollection(ArrayList::new));
        return numrat;
    }

}
