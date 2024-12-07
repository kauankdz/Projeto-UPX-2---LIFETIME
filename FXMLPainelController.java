/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package lifetime;

import java.awt.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PICHAU
 */




public class FXMLPainelController implements Initializable {

    /**
     * Initializes the controller class.
     */
     @FXML
    private Button btnDados;
     
    @FXML
    private Button btnNotificacao;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
      
    }    
    
    

    public class PainelController {

        
    @FXML
    private Button btnSair;
    
    @FXML
    private Button btnNotificacao;
    
    @FXML
    private Label labelUsuario;
    
    @FXML
    private Button btnDados;

    @FXML
    private Button btnRelatorio;

    @FXML
    private ImageView imgLgo;

    @FXML
    private AnchorPane painelPrincipal;

    @FXML
    private Text txtPainel;
    
      @FXML
    private Rectangle retPainel;

    @FXML
    private Text txtComo;

    @FXML
    private Text txtEstou;

    @FXML
    private Text txtHoje;

    @FXML
    private Text txtPainel_1;

    @FXML
    private Text txtPainel_2;

    @FXML
    private Text txtPainel_3;

    @FXML
    private Text txtPainel_4;

    @FXML
    private Text txtPainel_5;
    
    @FXML
    private ImageView imgFeliz;

    @FXML
    private ImageView imgRuim;

    @FXML
    private ImageView imgTedio;
    
    @FXML
    private Button btnFeliz;

    @FXML
    private Button btnFeliz2;

    @FXML
    private Button btnFeliz3;

    @FXML
    private Button btnFeliz4;

    @FXML
    private Button btnFeliz5;
    
    @FXML
    private Button btnRuim;

    @FXML
    private Button btnRuim2;

    @FXML
    private Button btnRuim3;

    @FXML
    private Button btnRuim4;

    @FXML
    private Button btnRuim5;
    
    @FXML
    private Button btnTedio;

    @FXML
    private Button btnTedio2;

    @FXML
    private Button btnTedio3;

    @FXML
    private Button btnTedio4;

    @FXML
    private Button btnTedio5;
}
    
    @FXML
    private void botaoMeusDados(ActionEvent event) {
        try {
            // Carregar o novo arquivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLMeusDados.fxml"));
            Parent root = loader.load();

            // Obter a cena atual
            Stage stage = (Stage) btnDados.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Meus Dados");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
   
    }   
    
    @FXML
    private void botaoNotoficacao(ActionEvent event) {
        try {
            // Carregar o novo arquivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLNotificacao.fxml"));
            Parent root = loader.load();

            // Obter a cena atual
            Stage stage = (Stage) btnNotificacao.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Notificacao");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
   
    }   
   
 
}
    

