package notifier;

import notifier.NotifierApplication;
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.Reflex;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.junit.*;
import static org.junit.Assert.*;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.util.WaitForAsyncUtils;

@Points("13-06")
public class NotifierApplicationTest extends ApplicationTest {

    private Stage stage;

    static {
        if (Boolean.getBoolean("SERVER")) {
            System.setProperty("java.awt.headless", "true");
            System.setProperty("testfx.robot", "glass");
            System.setProperty("testfx.headless", "true");
            System.setProperty("prism.order", "sw");
            System.setProperty("prism.text", "t2k");
            System.setProperty("glass.platform", "Monocle");
            System.setProperty("monocle.platform", "Headless");
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        NotifierApplication application = new NotifierApplication();

        try {
            Application app = Application.class.cast(application);
        } catch (Throwable t) {
            fail("Make sure the NotifierApplication class inherits the Application class.");
        }

        try {
            Reflex.reflect(NotifierApplication.class).method("start").returningVoid().taking(Stage.class).invokeOn(application, stage);
        } catch (Throwable ex) {
            fail("Make sure the NotifierApplication class has a method called start, which gets a Stage object as its parameter. If it has, make sure the method works. Error: " + ex.getMessage());
        }

        this.stage = stage;
    }

    @Test
    public void worksAsExpected() {
        Scene scene = stage.getScene();
        assertNotNull("The Stage object should have a scene object.", scene);

        Parent rootOfElements = scene.getRoot();
        assertNotNull("The Scene object should have a VBox as its root.", rootOfElements);

        VBox vbox = null;
        try {
            vbox = VBox.class.cast(rootOfElements);
        } catch (Throwable t) {
            fail("Make sure you're using the VBox class for laying out user interface components.");
        }

        assertEquals("Expected the user interface to contain three text elements.", 3, vbox.getChildren().size());

        Node first = vbox.getChildren().get(0);
        Node second = vbox.getChildren().get(1);
        Node third = vbox.getChildren().get(2);

        assertTrue("The first element should be a TextField.", first instanceof TextField);
        assertTrue("The second element should be a Button.", second instanceof Button);
        assertTrue("The third element should be a Label.", third instanceof Label);

        TextField textField = (TextField) first;
        Button button = (Button) second;
        Label label = (Label) third;

        // First test
        Platform.runLater(() -> textField.setText("Hello world!"));
        WaitForAsyncUtils.waitForFxEvents();

        clickOn(button);
        WaitForAsyncUtils.waitForFxEvents();

        final String[] labelText1 = new String[1];
        Platform.runLater(() -> labelText1[0] = label.getText());
        WaitForAsyncUtils.waitForFxEvents();

        assertEquals("Hello world!", labelText1[0]);

        // Second test
        Platform.runLater(() -> textField.setText("And other world!"));
        WaitForAsyncUtils.waitForFxEvents();

        clickOn(button);
        WaitForAsyncUtils.waitForFxEvents();

        final String[] labelText2 = new String[1];
        Platform.runLater(() -> labelText2[0] = label.getText());
        WaitForAsyncUtils.waitForFxEvents();

        assertEquals("And other world!", labelText2[0]);
    }
}
