package com.trivadis;

import java.math.BigInteger;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class OperatorCombineLatestJavaFX extends Application {
	private TextField numberInput1 = new TextField();
	private TextField numberInput2 = new TextField();
	private TextField output = new TextField();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		buildUi(stage);

		// TODO
	}

	private void buildUi(Stage stage) {
		output.setEditable(false);
		
		GridPane grid = new GridPane();
		grid.add(new Label("Zahl 1"), 0, 0);
		grid.add(new Label("Zahl 2"), 0, 1);
		grid.add(new Label("Zahl 1 + Zahl 2"), 0, 2);
		grid.add(numberInput1, 1, 0);
		grid.add(numberInput2, 1, 1);
		grid.add(output, 1, 2);
		Scene scene = new Scene(grid, 300, 150);
		stage.setTitle("RxJava");
		stage.setScene(scene);
		stage.show();
	}
}
