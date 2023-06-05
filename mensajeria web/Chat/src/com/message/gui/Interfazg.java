package com.message.gui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Interfazg {
	private AnchorPane anchorPane;
	private Button ingresar;
	private Button regresar;
	private HBox hbox1;
	private HBox hbox2;

	private Label titulolabel;
	private Label clavelabel;
	private Label userlabel;
	private Label avisolabel;
	private PasswordField clavetext;
	private TextField usertext;
	private VBox vbox1;
	private VBox vbox2;
	
	public Interfazg() {
		titulolabel = new Label("MENSAJERIA");
		userlabel = new Label("Usuario:");
		usertext = new TextField();
		clavelabel = new Label("  Pin:  ");
		clavetext = new PasswordField();
		ingresar = new Button("Ingresar");
		avisolabel = new Label();
		regresar = new Button("Volver");
		hbox1 = new HBox(10);
		hbox2 = new HBox(30);
		vbox1 = new VBox(20);;
		anchorPane = new AnchorPane();
	}

	public AnchorPane getAnchorPane() {
		return anchorPane;
	}

	public Button getingresar() {
		return ingresar;
	}

	public Button getRegresar() {
		return regresar;
	}

	public HBox getHbox1() {
		return hbox1;
	}
	
	public HBox getHbox2() {
		return hbox2;
	}



	public Label getTitulolabel() {
		return titulolabel;
	}

	public Label getClavelabel() {
		return clavelabel;
	}

	public Label getUserlabel() {
		return userlabel;
	}

	public Label getAvisolabel() {
		return avisolabel;
	}

	public void setAvisolabel(Label avisolabel) {
		this.avisolabel = avisolabel;
	}

	public PasswordField getClavetext() {
		return clavetext;
	}

	public void setClavetext(PasswordField clavetext) {
		this.clavetext = clavetext;
	}

	public TextField getUsertext() {
		return usertext;
	}

	public void setUsertext(TextField usertext) {
		this.usertext = usertext;
	}

	public VBox getVbox1() {
		return vbox1;
	}

	public void setVbox(VBox vbox1) {
		this.vbox1 = vbox1;
	}
	
	public VBox getVbox2() {
		return vbox2;
	}

	public void setVbox2(VBox vbox2) {
		this.vbox2 = vbox2;
	}
	
	public void contenidoVbox1() {		
		hbox1.getChildren().addAll(userlabel, usertext);
		hbox2.getChildren().addAll(clavelabel, clavetext);
		vbox1.getChildren().addAll(hbox1, hbox2);		
	}
	
	public VBox contenidoVbox2() {
		vbox2 = new VBox(15, avisolabel, regresar);
		vbox2.setAlignment(Pos.CENTER);
		vbox2.setId("vbox");
		return vbox2;
	}
	
	public void notificar(String username, String password) {
		if(username.equals("") || password.equals(""))
			avisolabel.setText("Error al ingresar");
		else
			avisolabel.setText("El usuario o pin ingresado no es correcto");	
	}
	
	public AnchorPane anchor() {
		anchorPane.getChildren().addAll(titulolabel, vbox1, ingresar);
		AnchorPane.setLeftAnchor(titulolabel, 100d);
    	AnchorPane.setTopAnchor(titulolabel, 80d);
    	
    	AnchorPane.setLeftAnchor(ingresar, 120d);
    	AnchorPane.setBottomAnchor(ingresar, 110d);
    	AnchorPane.setLeftAnchor(vbox1, 30d);
    	AnchorPane.setTopAnchor(vbox1, 195d);
    	return anchorPane;
	}
	
	public void styles() {
		ingresar.setStyle("-fx-font-weight: normal;\r\n"
				+ " -fx-font-weight: bold;\r\n"
				+ " -fx-font-family: 'Arial';\r\n"
				+ " -fx-font-size: 120%;\r\n"
				+ " -fx-text-fill: black;\r\n"
				+ " -fx-border-color: black;\r\n"
				+ " -fx-border-width: 2px;\r\n"
				+ " -fx-border-radius: 10px;\r\n"
				+ " -fx-background-radius: 10px;");
		
		regresar.setStyle("-fx-font-weight: normal;\r\n"
				+ " -fx-font-weight: bold;\r\n"
				+ " -fx-font-family: 'Arial';\r\n"
				+ " -fx-font-size: 120%;\r\n"
				+ " -fx-text-fill: black;\r\n"
				+ " -fx-border-color: black;\r\n"
				+ " -fx-border-width: 2px;\r\n"
				+ " -fx-border-radius: 10px;\r\n"
				+ " -fx-background-radius: 10px;");
		
		titulolabel.setStyle("-fx-font-weight: bold;\r\n"
				+ " -fx-font-family: 'Times New Roman';\r\n"
				+ " -fx-font-size: 150%;\r\n"
				+ " -fx-text-fill: white;\r\n"
				+ " -fx-background-color: rgb(0,0,0);\r\n"
				+ " -fx-border-color: black;\r\n"
				+ " -fx-border-width: 2;\r\n"
				+ " -fx-border-radius: 5;\r\n"
				+ " -fx-padding: 10;");
		
		userlabel.setStyle("-fx-font-weight: bold;\r\n"
				+ "	-fx-font-family: 'Arial';\r\n"
				+ "	-fx-font-size: 150%;\r\n"
				+ "	-fx-text-fill: rgb(0,0,0);");
		
		clavelabel.setStyle("-fx-font-weight: bold;\r\n"
				+ "	-fx-font-family: 'Arial';\r\n"
				+ "	-fx-font-size: 150%;\r\n"
				+ "	-fx-text-fill: rgb(0,0,0);");
		
		usertext.setStyle("-fx-font-weight: normal;\r\n"
				+ "	-fx-font-family: 'Arial';\r\n"
				+ "	-fx-font-size: 120%;\r\n"
				+ "	-fx-focus-traversable: false;");
		
		clavetext.setStyle("-fx-font-weight: normal;\r\n"
				+ "	-fx-font-family: 'Arial';\r\n"
				+ "	-fx-font-size: 120%;\r\n"
				+ "	-fx-focus-traversable: false;\r\n");
		
		avisolabel.setStyle("-fx-font-weight: normal;\r\n"
				+ "	-fx-font-family: 'Arial';\r\n"
				+ "	-fx-font-size: 150%;\r\n"
				+ "	-fx-text-fill: rgb(0,0,0);");
	}
}
