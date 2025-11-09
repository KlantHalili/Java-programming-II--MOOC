
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> fjalite = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                String output = fjalite.stream()
                        .reduce("",(PrevString, value) -> PrevString + value +"\n");
                System.out.println(output);
                break;
            } else {
                fjalite.add(input);
            }
        }

    }
}
