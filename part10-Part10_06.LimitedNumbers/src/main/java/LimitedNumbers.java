
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> numrat = new ArrayList<>();
        while(true){
            int input = scanner.nextInt();
            if ( input <0){
                numrat.stream()
                        .filter(s -> s>=1 && s<=5)
                        .forEach(s -> System.out.println(s));
                break;
            }
            numrat.add(input);
        }

    }
}
