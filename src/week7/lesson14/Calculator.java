package week7.lesson14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Calculator extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Calculator");
		stage.setScene(createScene());
		stage.show();
	}

	public Scene createScene() {
		HBox hBox1 = new HBox(10);
		
		hBox1.setMinSize(100, 100);

		Button btn1 = new Button("Button 1");
		Button btn2 = new Button("Button 2");
		Button btn3 = new Button("Button 3");
		Button btn4 = new Button("Button 4");

		hBox1.setAlignment(Pos.TOP_LEFT);
		hBox1.getChildren().add(btn1);
		hBox1.getChildren().add(btn2);
		hBox1.getChildren().add(btn3);
		hBox1.getChildren().add(btn4);
		//
		HBox hBox2 = new HBox(50);// 10

		Button btn5 = new Button("Button 5");
		Button btn6 = new Button("Button 6");
		Button btn7 = new Button("Button 7");
		Button btn8 = new Button("Button 8");

		hBox2.setAlignment(Pos.TOP_LEFT);
		hBox2.getChildren().add(btn5);
		hBox2.getChildren().add(btn6);
		hBox2.getChildren().add(btn7);
		hBox2.getChildren().add(btn8);
		//
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setHgap(20);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		//
		grid.add(hBox1, 0, 0);
		grid.add(hBox2, 0, 1);

		//
		Scene scene = new Scene(grid, 600, 400);
		return scene;
	}
}
