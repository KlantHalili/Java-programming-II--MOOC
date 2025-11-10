package collage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();
        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        for (int y = 0; y < height; y += 2) {
            for (int x = 0; x < width; x += 2) {
                Color original = imageReader.getColor(x, y);

                double red = 1.0 - original.getRed();
                double green = 1.0 - original.getGreen();
                double blue = 1.0 - original.getBlue();
                double opacity = original.getOpacity();

                Color negative = new Color(red, green, blue, opacity);

                int dx = x / 2;
                int dy = y / 2;

                imageWriter.setColor(dx, dy, negative);

                imageWriter.setColor(dx + width / 2, dy, negative);

                imageWriter.setColor(dx, dy + height / 2, negative);

                imageWriter.setColor(dx + width / 2, dy + height / 2, negative);
            }
        }

        ImageView imageView = new ImageView(targetImage);
        Pane pane = new Pane(imageView);
        Scene scene = new Scene(pane);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
