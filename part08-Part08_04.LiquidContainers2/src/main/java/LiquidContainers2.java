import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

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
                container1.add(valuta);

            } else if (command.equals("move")) {
                int actualMove;

                if (valuta > container1.contains()) {
                    actualMove = container1.contains();
                } else {
                    actualMove = valuta;
                }

                int spaceLeft = 100 - container2.contains();

                if (spaceLeft > 0) {
                    if (actualMove > spaceLeft) {
                        container1.remove(spaceLeft);
                        container2.add(spaceLeft);
                    } else {
                        container1.remove(actualMove);
                        container2.add(actualMove);
                    }
                }
                // If no space left, do nothing

            } else if (command.equals("remove")) {
                container2.remove(valuta);

            } else {
                System.out.println("Unknown command.");
            }
        }

        scan.close();
    }
}
