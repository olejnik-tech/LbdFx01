package tech.olejnik;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    /*
    Layers:
    1. Stage: top level container (similar to JFrame and Swing), windows for app
    2. Scene: Drawing for graphical content (similar to JPanel in Swing)
    3. Scene-Graph: tree data structure for nodes
    4. Nodes: we need at least root node to create a scene
     */

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Method automatically called with launch(args) in main method.
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root,600,600, Color.SKYBLUE);

        Text text = new Text();
        text.setText("Hello JavaFX");
        text.setFont(Font.font("Ariel",40));
        text.setFill(Color.RED);
        text.setX(50);
        text.setY(50);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.BLUE);
        line.setOpacity(0.5);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 300.0
        );
        triangle.setFill(Color.YELLOW);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(240);
        circle.setRadius(40);
        circle.setFill(Color.KHAKI);

        Image image = new Image("dogo.jpg"); //files on source folder does not need specify folder
        ImageView imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(350);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show(); // need to have this at the end of the method
    }
}