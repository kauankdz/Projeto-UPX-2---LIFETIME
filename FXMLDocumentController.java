/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package lifetime;

import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

 

    /**
     *
 * @author PICHAU
     */
    public class FXMLDocumentController implements Initializable {

    @FXML
    private HBox backgroundLogin;


    @FXML
    private TextField entradaSenha;
    
    @FXML
    private Hyperlink btnRegistro;
    
    @FXML
    private Button btnEntrar;

    @FXML
    private TextField entradaUsuario;
    
    @FXML
    private ImageView imgLogo;

    @FXML
    private AnchorPane painelCentral;

    @FXML
    private Text txtSenha;

    @FXML
    private Text txtUsuario;

    @FXML
    private Label labelStage;

    @FXML
    private Label labelOla;
    
    @FXML
    private Label labelErro;
    
    @FXML
     private void acaoBotao1(ActionEvent event) {
        String usuario = entradaUsuario.getText();
        String senha = entradaSenha.getText();

        Login loginService = new Login();
        if (loginService.autenticar(usuario, senha)) {
            // Redireciona para a próxima página
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLPainel.fxml"));
                Parent nextPage = loader.load();
                Stage stage = (Stage) btnEntrar.getScene().getWindow();
                stage.setScene(new Scene(nextPage));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            labelOla.setText("");
            labelErro.setText("Usuário ou senha incorretos!");
        }
     }
     
    @FXML
    private void botaoRegistrar(ActionEvent event) {
        try {
            // Carregar o novo arquivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLCadastro.fxml"));
            Parent root = loader.load();

            // Obter a cena atual
            Stage stage = (Stage) btnRegistro.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Cadastro");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
   
    }

     @Override
     public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
     }
    
       
}
