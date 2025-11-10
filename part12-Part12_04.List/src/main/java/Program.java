
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<Integer> myList = new List<>();
        myList.add(32);
        myList.add(15);
        System.out.println(myList);
        boolean isIt = myList.contains(15);
        System.out.println(isIt);

    }

}
