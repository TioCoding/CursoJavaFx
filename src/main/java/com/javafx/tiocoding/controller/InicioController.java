package com.javafx.tiocoding.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class InicioController implements Initializable{
	
	@FXML
	private Button btnAccion;

	@FXML
	private TextField txtMensaje;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Estoy cargando");
		txtMensaje.setText("Escrbia su mensaje");
		btnAccion.setOnAction(event -> System.out.println("Ell nuevo mensaje es: " + txtMensaje.getText()));
	}
	
}
