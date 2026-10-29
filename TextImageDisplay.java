import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextImageDisplay extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, JavaFX!");
        
        Image image = new Image("https://via.placeholder.com/200x200.png?text=JavaFX");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);

        VBox root = new VBox(20);
        root.getChildren().addAll(label, imageView);
        root.setStyle("-fx-alignment: center; -fx-padding: 20;");

        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("Text and Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
