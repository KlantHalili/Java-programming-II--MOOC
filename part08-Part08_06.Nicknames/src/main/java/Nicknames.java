
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> lista = new HashMap<>();
        lista.put("matthew", "matt");
        lista.put("michael", "mix");
        lista.put("artur", "artie");
        
        System.out.println(lista.get("michael"));
    }

}
