import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class EyeHandCoordination extends Application {
    static int count = 1;

    @Override
    public void start(Stage primaryStage) {
        final double WIDTH = 300.0;
        final double HEIGHT = 300.0;
        long startTime = System.currentTimeMillis();
        Pane pane = new Pane();

        Circle circle =
                new Circle(Math.random() * 200 + 50, Math.random() * 200 + 50, 10);
        circle.setFill(
                Color.color(Math.random(), Math.random(), Math.random(), 1.0));
        circle.setOnMouseClicked(e -> {
            if (count == 20) {
                pane.getChildren().clear();
                long totalTime = System.currentTimeMillis() - startTime;
                Text time = new Text(0, HEIGHT / 2,
                        String.format("Time spent is %d milliseconds", totalTime));
                pane.getChildren().add(time);
            } else {
                circle.setCenterX(Math.random() * 200 + 50);
                circle.setCenterY(Math.random() * 200 + 50);
                circle.setFill(
                        Color.color(Math.random(), Math.random(), Math.random(), 1.0));
                count++;
            }
        });
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("EyeHandCoordination");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}