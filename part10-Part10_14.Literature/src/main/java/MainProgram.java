
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> lista = new ArrayList<>();
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String titulli = scanner.nextLine();
            if(titulli.equals("")){
                System.out.println(lista.size()+" books in total.");
                System.out.println("Books: ");
                Comparator<Book> comparator = Comparator
                        .comparing(Book::getAge)
                        .thenComparing(Book::getName);
                Collections.sort(lista, comparator);
                for (Book book: lista){
                    System.out.println(book);
                }
                break;
            } else {
                System.out.println("Input the age recommandation: ");
                int n = scanner.nextInt();
                scanner.nextLine();
                lista.add(new Book(titulli, n));
            }
        }
    }
}
