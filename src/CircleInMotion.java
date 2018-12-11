import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
// Laver en nedarvning via extends, som tager fra Application.
public class CircleInMotion extends Application {
    @Override
    /** Laver en start metode som indeholder double.
     *
     */
    public void start(Stage primaryStage) {
        final double WIDTH = 500.0;
        final double HEIGHT = 500.0;

        /**Indsætter cirklens værdier.
         *
         */
        Circle circle = new Circle(Math.min(HEIGHT, WIDTH) / 10);
        circle.setCenterX(WIDTH / 2);
        circle.setCenterY(HEIGHT / 2);
        circle.setFill(Color.RED);
        circle.setStroke(Color.WHITE);
        /** Laver knapperne.
         *
         */
        circle.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP: circle.setCenterY(circle.getCenterY() - 10); break;
                case DOWN: circle.setCenterY(circle.getCenterY() + 10); break;
                case LEFT: circle.setCenterX(circle.getCenterX() - 10); break;
                case RIGHT: circle.setCenterX(circle.getCenterX() + 10); break;
                case W: circle.setCenterY(circle.getCenterY() - 10); break;
                case S: circle.setCenterY(circle.getCenterY() + 10); break;
                case A: circle.setCenterX(circle.getCenterX() - 10); break;
                case D: circle.setCenterX(circle.getCenterX() + 10);
            }
        });
        /** Opretter en fane, hvor der bliver indlæst de forrige indformationer og indsætter circle.
         *
         */
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        scene.setFill(Color.BLACK);
        primaryStage.setTitle("Circle In Motion");
        primaryStage.setScene(scene);
        primaryStage.show();

        circle.requestFocus();
    }

    /** Laver en launch metode.
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}