/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package lifetime;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PICHAU
 */
public class FXMLMeusDadosController implements Initializable {

    
    /**
     * Initializes the controller class.
     */
    
     @FXML
     private Button btnNotificacao;
     
    @FXML
    private Button btnPainel;

  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
       
    
    }    

     public class MeusDados{ 

    @FXML
    private AnchorPane painelDados;
    
    @FXML
    private Button btnDados;

    @FXML
    private Button btnNotificacao;

    @FXML
    private Button btnRelatorio;

    @FXML
    private Button btnSair;

    @FXML
    private Button btnSaude;

    @FXML
    private ImageView imgLgo;

    @FXML
    private Button btnPainel;

    @FXML
    private Text txtAltura;

    @FXML
    private Text txtCargo;

    @FXML
    private Text txtEmpresa;

    @FXML
    private Text txtHorario;

    @FXML
    private Text txtIdade;

    @FXML
    private Text txtMD;

    @FXML
    private Text txtNome;

    @FXML
    private Text txtP1;

    @FXML
    private Text txtP2;

    @FXML
    private Text txtP3;

    @FXML
    private Text txtP4;

    @FXML
    private Text txtP5;

    @FXML
    private Text txtP6;

    @FXML
    private Text txtPeso;
    
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
    
    @FXML
    private void botaoPainel(ActionEvent event) {
        try {
            // Carregar o novo arquivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLPainel.fxml"));
            Parent root = loader.load();

            // Obter a cena atual
            Stage stage = (Stage) btnPainel.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Painel");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
   
    }   
    }
    
   
    
    
   
