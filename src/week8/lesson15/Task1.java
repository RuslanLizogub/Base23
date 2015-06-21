package week8.lesson15;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Task1 extends Application {
	private static int countBoxes = 0;
	private static int countCheckBox = 8;
	private static String colorResult = "grey";
	private static CheckBox[] checkboxes = new CheckBox[countCheckBox];
	private static Label[] checkboxes_name = new Label[countCheckBox];

	public static void main(String[] args) {
		launch(args);
	}

	static {
		for (int i = 0; i < checkboxes.length; i++)
			checkboxes[i] = newCheckBox();
		for (int i = 0; i < checkboxes.length; i++)
			checkboxes_name[i] = new Label("яюых" + (i + 1));
	}

	public static CheckBox newCheckBox() {
		CheckBox obj = new CheckBox();
		obj.setMaxSize(10, 10);
		obj.setStyle("-fx-top:2");
		return obj;
	}

	@Override
	public void start(Stage stage) throws Exception {
		GridPane grid = new GridPane();

		// grid.add(addStyleToHbox(getHBox1()), 0, countBoxes);
		// grid.add(addStyleToHbox(getHBox2()), 0, countBoxes);
		// grid.add(addStyleToHbox(getHBox3()), 0, countBoxes);
		// grid.add(addStyleToHbox(getHBox4()), 0, countBoxes);

		Scene scene = new Scene(grid, 1200, 400);
		stage.setScene(scene);
		stage.setTitle("myProgram");
		stage.show();
	}
}
/*
 * 1. ═ряшёрЄ№ сыюъ яхЁхтюфр фхё Єшўэюую ўшёыр т фтюшўэ√щ ъюф (Text) / public
 * HBox getHBox1(){ HBox box = new HBox(10); box.setMinSize(750, 50);
 * box.setMaxSize(750, 50); Button btn1 = new Button("╧хЁхтюф"); TextField text1
 * = new TextField(""); TextField text2 = new TextField("");
 * btn1.addEventHandler(MouseEvent.MOUSE_CLICKED , new
 * EventHandler<MouseEvent>() {
 * 
 * @Override public void handle(MouseEvent e) {
 * text2.setText(getBinaryFromDecimal(text1.getText())); }});
 * 
 * text1.setMaxSize(120, 40); text2.setMaxSize(160, 40);
 * text2.setEditable(false); text2.setStyle("-fx-background-color:"+colorResult+
 * ";-fx-background-radius: 2px;-fx-border-radius: 2px;-fx-border-color:black");
 * box.getChildren().add(createNewCounter("Перевод в двоичную"));
 * box.getChildren().add(text1); box.getChildren().add(btn1);
 * box.getChildren().add(text2); return box; } public HBox getHBox2(){ HBox box
 * = new HBox(10); box.setMinSize(750, 50); box.setMaxSize(750, 50); Button btn1
 * = new Button("╧хЁхтюф"); TextField text1 = new TextField(""); TextField text2
 * = new TextField(""); btn1.addEventHandler(MouseEvent.MOUSE_CLICKED , new
 * EventHandler<MouseEvent>() {
 * 
 * @Override public void handle(MouseEvent e) {
 * text2.setText(getDecimalBinaryFromBinary(text1.getText())); }});
 * 
 * text1.setMaxSize(160, 40); text2.setMaxSize(120, 40);
 * text2.setEditable(false); text2.setStyle("-fx-background-color:"+colorResult+
 * ";-fx-background-radius: 2px;-fx-border-radius: 2px;-fx-border-color:black");
 * box.getChildren().add(createNewCounter("Перевод в десятичную"));
 * box.getChildren().add(text1); box.getChildren().add(btn1);
 * box.getChildren().add(text2); return box; } public HBox getHBox3(){ HBox box
 * = new HBox(10); box.setMinSize(950, 50); box.setMaxSize(1010, 50); TextField
 * text2 = new TextField(""); text2.setMaxSize(90, 40);
 * text2.setEditable(false); text2.setStyle("-fx-background-color:"+colorResult+
 * ";-fx-background-radius: 2px;-fx-border-radius: 2px;-fx-border-color:black");
 * box.getChildren().add(createNewCounter("└тЄюьрЄшўхёъюх юяЁхфхыхэшх сшЄют"));
 * for(int i=0;i<checkboxes.length;i++){ box.getChildren().add(new
 * Label((i+1)+"")); box.getChildren().add(checkboxes[i]);
 * checkboxes[i].selectedProperty().addListener(new ChangeListener<Boolean>() {
 * 
 * @Override public void changed(ObservableValue<? extends Boolean> observable,
 * Boolean oldValue, Boolean newValue) { text2.setText(getBytesByCheckbox()); }
 * }); // .selectedProperty().removeListener(new ChangeListener<Boolean>() { //
 * public void changed(ObservableValue<? extends Boolean> ov, // Boolean
 * old_val, Boolean new_val) { // icon.setImage(new_val ? image : null); // } //
 * }); } box.getChildren().add(text2); return box; } public HBox getHBox4(){
 * HBox box = new HBox(10); box.setMinSize(950, 50); box.setMaxSize(1010, 50);
 * TextField text2 = new TextField(""); text2.setMaxSize(90, 40);
 * //text2.setStyle(
 * "-fx-background-color:azure;-fx-background-radius: 2px;-fx-border-radius: 2px;-fx-border-color:blacke"
 * ); box.getChildren().add(createNewCounter("╧юсшЄютюх юяЁхфхыхэшх яюыхщ"));
 * for(int i=0;i<checkboxes.length;i++){
 * box.getChildren().add(checkboxes_name[i]); } box.getChildren().add(text2);
 * text2.addEventHandler(MouseEvent.MOUSE_EXITED , new
 * EventHandler<MouseEvent>() {
 * 
 * @Override public void handle(MouseEvent e) { initFields(text2.getText());
 * }}); return box; }
 * 
 * public HBox addStyleToHbox(HBox box){ int k = (int)((100*Math.random()%10));
 * String color = "black"; switch (k){ case 0: color="maroon";break; case 1:
 * color="teal";break; case 2: color="purple";break; case 3: color="grey";break;
 * case 4: color="pink";break; case 5: color="gold";break; case 6:
 * color="yellow";break; case 7: color="green";break; case 8:
 * color="azure";break; case 9: color="navy";break; case 10:
 * color="violet";break;
 * 
 * } String s = "-fx-border-color: maroon;" + "-fx-font-size: 20;" +
 * "-fx-border-radius: 5px;" + "-fx-background-radius: 5px;" +
 * "-fx-background-color:"+color + ";-fx-border-width: 2;"; box.setStyle(s);
 * 
 * return box; }
 * 
 * public TextField createNewCounter(String name){ countBoxes++; TextField text
 * = new TextField(" "+countBoxes+". "+name);
 * text.setStyle("-fx-font-size: 14;-fx-background-color:azure;");
 * text.setEditable(false); text.setMinSize(300, 30); text.setMaxSize(350, 40);
 * return text; }
 */