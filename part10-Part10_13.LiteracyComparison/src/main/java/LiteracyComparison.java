
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList <String> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv")).forEach(row -> rows.add(row));
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        rows.stream()
                .map(p -> p.split(","))
                .sorted((a, b) -> Double.compare(Double.valueOf(a[5]), Double.valueOf(b[5])))
                .map(p -> {
                    p[2] = p[2].replace("(%)", "").trim();
                return p;
                        })
                .forEach(p -> System.out.println(p[3]+" "+"("+p[4]+"), "+p[2]+", "+p[5]));
    }
}
