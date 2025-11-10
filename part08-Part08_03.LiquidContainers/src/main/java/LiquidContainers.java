import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] komanda = input.split(" ");
            if (komanda.length < 2) {
                System.out.println("Invalid command.");
                continue;
            }

            String command = komanda[0];
            int valuta;

            try {
                valuta = Integer.valueOf(komanda[1]);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            if (valuta < 0) {
                continue;
            }

            if (command.equals("add")) {
                if (container1 + valuta > 100) {
                    container1 = 100;
                } else {
                    container1 += valuta;
                }

            } else if (command.equals("move")) {
                if (valuta > container1) {
                    valuta = container1;
                }

                container1 -= valuta;

                if (container2 + valuta > 100) {
                    container2 = 100;
                } else {
                    container2 += valuta;
                }

            } else if (command.equals("remove")) {
                if (valuta > container2) {
                    container2 = 0;
                } else {
                    container2 -= valuta;
                }

            } else {
                System.out.println("Unknown command.");
            }
        }

        scan.close();
    }
}
