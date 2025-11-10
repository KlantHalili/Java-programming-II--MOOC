package mooc;
import mooc.logic.ApplicationLogic;
import mooc.ui.TextInterface;

public class Main {
    public static void main(String[] args) {
        TextInterface ui = new TextInterface();
        ApplicationLogic logic = new ApplicationLogic(ui);
        logic.execute(3);
    }
}