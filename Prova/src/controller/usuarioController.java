package controller;

import java.io.IOException;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class usuarioController {
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
	    
	    //tela atual
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

	    

		@FXML
		public void Novo(Stage primaryStage) throws IOException {
			try {
				BorderPane root = new BorderPane();
				Scene scene = new Scene(root,400,400);
				scene.getStylesheets().add(getClass().getResource("view/FXMLInclusao.fxml").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		

}

