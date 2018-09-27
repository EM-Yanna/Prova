package controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class cadastroController {
	@FXML
    private TableColumn<?, ?> clmUsuario;

    @FXML
    private TableColumn<?, ?> clmId;

    @FXML
    private TableColumn<?, ?> clmEmail;

    @FXML
    private Button btnNovo;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnRemover;

    // tela atual
	  @FXML
	    private Button btnSalvar;

	    @FXML
	    private TextField txtSenha;

	    @FXML
	    private TextField txtEmail;

	    @FXML
	    private ComboBox<?> cbxCargo;

	    @FXML
	    private Button btnLimpar;

	    @FXML
	    private TextField txtUsuario;

    


	 public void Limpar() {
	    	txtUsuario.setText("");

	    	txtEmail.setText("");

	    	txtSenha.setText("");
		}

	    public void Salvar() {
	    	//clmId.setText(txtUsuario.getText());

	    	clmUsuario.setText(txtUsuario.getText());

	    	clmEmail.setText(txtEmail.getText());
	    	
	   
		}
	    
	    public void incrementar (int id) {
	    id = id + 1;
	    	
	    }
}


