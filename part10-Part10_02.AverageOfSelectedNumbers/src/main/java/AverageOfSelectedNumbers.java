
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> numrat = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String input2 = scanner.nextLine();
                if(input2.equals("n")){
                    double negativeAverage = numrat.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(s -> s<0)
                            .average()
                            .getAsDouble();
                    System.out.println("Average of the negative numbers: "+negativeAverage);
                } else if (input2.equals("p")){
                    double positiveAverage = numrat.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(s -> s>0)
                            .average()
                            .getAsDouble();
                    System.out.println("Average of positive numbers: "+positiveAverage);
                }
                break;
            } else {
                    numrat.add(Integer.valueOf(input));
                }
        }
    }
}
