
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String, Integer> hashi = new HashMap<>();
        hashi.add("mir", 1);
        hashi.add("mir", 2);
        hashi.add("keq", 3);
        hashi.add("shume", 5);
        hashi.get("shume");
        hashi.remove("mir");
       for(String string: hashi.getKeys()){
           System.out.println(hashi.get(string));
       }

    }

}
