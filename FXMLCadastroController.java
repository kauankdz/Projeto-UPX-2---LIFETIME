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
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PICHAU
 */
public class FXMLCadastroController implements Initializable {

    
    @FXML
    private Button btnCadastrar;
    
    @FXML
    private TextField entradaCarga;

    @FXML
    private TextField entradaCargo;

    @FXML
    private TextField entradaCpf;

    @FXML
    private TextField entradaEmail;

    @FXML
    private TextField entradaEmpresa;

    @FXML
    private TextField entradaIdade;

    @FXML
    private TextField entradaNome;

    @FXML
    private TextField entradaPeso;

    @FXML
    private TextField entradaSenha;

    @FXML
    private TextField entradaUsuario2;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
    /**
     *
     */
    public class CadastroController {

    @FXML
    private HBox backgroundLogin;
    
    @FXML
    private Button btnCadastrar;

    @FXML
    private CheckBox chkNao;

    @FXML
    private CheckBox chkNao2;

    @FXML
    private CheckBox chkNao3;

    @FXML
    private CheckBox chkNao4;

    @FXML
    private CheckBox chkNao5;

    @FXML
    private CheckBox chkSim;

    @FXML
    private CheckBox chkSim2;

    @FXML
    private CheckBox chkSim3;

    @FXML
    private CheckBox chkSim4;

    @FXML
    private CheckBox chkSim5;

    @FXML
    private TextField entradaCarga;

    @FXML
    private TextField entradaCargo;

    @FXML
    private TextField entradaCpf;

    @FXML
    private TextField entradaEmail;

    @FXML
    private TextField entradaEmpresa;

    @FXML
    private TextField entradaIdade;

    @FXML
    private TextField entradaNome;

    @FXML
    private TextField entradaPeso;

    @FXML
    private TextField entradaSenha;

    @FXML
    private TextField entradaUsuario2;

    @FXML
    private ImageView imgLogo;

    @FXML
    private Label labelErro;

    @FXML
    private Label labelOla;

    @FXML
    private AnchorPane painelCentral;

    @FXML
    private Text txtAtividade;

    @FXML
    private Text txtCarga;

    @FXML
    private Text txtCargo;

    @FXML
    private Text txtCpf;

    @FXML
    private Text txtDeficiencia;

    @FXML
    private Text txtEmail;

    @FXML
    private Text txtEmpresa;

    @FXML
    private Text txtIdade;

    @FXML
    private Text txtNome;

    @FXML
    private Text txtOculos;

    @FXML
    private Text txtPeso;

    @FXML
    private Text txtRemedio;

    @FXML
    private Text txtSenha;

    @FXML
    private Text txtTranstorno;

    @FXML
    private Text txtUsuario;

}
    
    @FXML
    private void botaoCadastrar(ActionEvent event) {
        
        if(entradaCarga != null & entradaCargo != null & entradaCpf != null & entradaEmail  != null & entradaEmpresa != null & entradaIdade != null & entradaNome != null & entradaPeso != null & entradaSenha != null & entradaUsuario2 != null){
             
            
        
        try {
            // Carregar o novo arquivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLPainel.fxml"));
            Parent root = loader.load();  
        
            // Obter a cena atual 
            Stage stage = (Stage) btnCadastrar.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Painel");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        else{
            
            System.out.println("Complete todos os campos!");
        }
    
    }   

     
}
