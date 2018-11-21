import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class EllipseAnimated extends Application {
    @Override
    public void start(Stage primaryStage) {
        final double WIDTH = 200.0;
        final double HEIGHT = 150.0;

        BorderPane pane = new BorderPane();
        StackPane sp = new StackPane();
        sp.setPadding(new Insets(200));

        Ellipse ellipse = new Ellipse(175, 75);
        ellipse.setFill(Color.ORANGE);
        ellipse.setStroke(Color.BLACK);
        sp.getChildren().add(ellipse);

        Button btRotate = new Button("Rotate");
        btRotate.setOnAction(e -> ellipse.setRotate(ellipse.getRotate() + 30));

        pane.setCenter(sp);
        pane.setBottom(btRotate);
        BorderPane.setAlignment(btRotate, Pos.CENTER);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("EllipseAnimated");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}