package com.javafx.tiocoding.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.fxml.Initializable;

public class FormularioController implements Initializable{

	@FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellidoPaterno;

    @FXML
    private TextField txtApellidoMaterno;

    @FXML
    private TextField txtDNI;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtUsuario;

    @FXML
    private DatePicker dateFechaN;

    @FXML
    private ComboBox<String> cboEstado;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private RadioButton rbMasculino;

    @FXML
    private ToggleGroup groupSexo;

    @FXML
    private RadioButton rbFemenino;

    @FXML
    private Button btnNuevo;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnModificar;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnSalir;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {		
		ObservableList<String> estados = FXCollections.observableArrayList("Soltero","Casado","Divorciado","Viudo");
		cboEstado.setItems(estados);
		cboEstado.getSelectionModel().select(0);
	}

	
	
}
