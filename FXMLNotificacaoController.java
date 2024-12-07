/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package lifetime;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author PICHAU
 */
public class FXMLNotificacaoController implements Initializable {
    
    @FXML
    private Button btnDados;
     
    @FXML
    private Button btnPainel;
    
       @FXML
    private CheckBox checkPosturaNot;

    @FXML
    private CheckBox checkQuinze;

    @FXML
    private CheckBox checkTodasNot;

    @FXML
    private CheckBox checkTrinta;

    @FXML
    private CheckBox checkUma;

    @FXML
    private CheckBox checkUmaTrinta;

    @FXML
    private CheckBox checkVisaoNot; 
    
    @FXML
    private CheckBox checkBeberNot;
    
     /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
     public class NotificacaoController {
         
     
    @FXML
    private Button btnDados;

    @FXML
    private Button btnNotificacao;

    @FXML
    private Button btnRelatorio;

    @FXML
    private Button btnSair;
    
    @FXML
    private Button btnPainel;

    @FXML
    private Button btnSaude;

    @FXML
    private ImageView imgLgo;

    @FXML
    private AnchorPane painelDados;
    
    @FXML
    private CheckBox checkBeberNot;

    @FXML
    private CheckBox checkPosturaNot;

    @FXML
    private CheckBox checkQuinze;

    @FXML
    private CheckBox checkTodasNot;

    @FXML
    private CheckBox checkTrinta;

    @FXML
    private CheckBox checkUma;

    @FXML
    private CheckBox checkUmaTrinta;

    @FXML
    private CheckBox checkVisaoNot; 
    
    @FXML
    private Text txtNotificacao;

    @FXML
    private Text txtTempo;
}
     
      @FXML
    private void botaoMeusDados2(ActionEvent event) {
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
    private void botaoPainel2(ActionEvent event) {
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
    
     @FXML
    private void botaoNotificacao2(ActionEvent event) {
        // Criar um Timeline para as notificações
        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE); // Repetir indefinidamente

        // Adicionar KeyFrames para cada notificação
        if (checkQuinze.isSelected()) {
            KeyFrame keyFrame15 = new KeyFrame(Duration.minutes(15), e -> {
                showPopup("Faça uma pausa a cada 15 minutos!", 5000); // 5 segundos
            });
            timeline.getKeyFrames().add(keyFrame15);
        }
        if (checkTrinta.isSelected()) {
            KeyFrame keyFrame30 = new KeyFrame(Duration.minutes(30), e -> {
                showPopup("Levante-se a cada 30 minutos!", 5000); // 5 segundos
            });
            timeline.getKeyFrames().add(keyFrame30);
        }
        if (checkUma.isSelected()) {
            KeyFrame keyFrame60 = new KeyFrame(Duration.hours(1), e -> {
                showPopup("Lembre-se de fazer uma pausa de 1 hora!", 5000); // 5 segundos
            });
            timeline.getKeyFrames().add(keyFrame60);
        }
        if (checkUmaTrinta.isSelected()) {
            KeyFrame keyFrame90 = new KeyFrame(Duration.hours(1.5), e -> {
                showPopup("Faça uma pausa de 1 hora e 30 minutos!", 5000); // 5 segundos
            });
            timeline.getKeyFrames().add(keyFrame90);
        }
        if (checkBeberNot.isSelected()) {
            KeyFrame keyFrameBeber = new KeyFrame(Duration.minutes(60), e -> {
                showPopup("Lembre-se de beber água!", 5000); // 5 segundos
            });
            timeline.getKeyFrames().add(keyFrameBeber);
        }
        if (checkPosturaNot.isSelected()) {
            KeyFrame keyFramePostura = new KeyFrame(Duration.minutes(60), e -> {
                showPopup("Mantenha uma boa postura!", 5000); // 5 segundos
            });
            timeline.getKeyFrames().add(keyFramePostura);
        }

        // Iniciar o Timeline
        timeline.play();
    }
    
     private void showPopup(String message, int duration) {
        // Criar uma nova Stage para a notificação
        Stage popupStage = new Stage();
        Text popupText = new Text(message);
        AnchorPane popupPane = new AnchorPane(popupText);
        Scene popupScene = new Scene(popupPane, 300, 100);
        
        popupStage.setScene(popupScene);
        popupStage.setTitle("Notificação");
        popupStage.setAlwaysOnTop(true); // Manter a notificação sempre no topo
        popupStage.setResizable(false); // Não permitir redimensionamento

        // Centralizar a notificação na tela
        popupStage.setX((popupStage.getWidth() / 2) + (popupStage.getWidth() / 2));
        popupStage.setY((popupStage.getHeight() / 2) + (popupStage.getHeight() / 2));

        // Mostrar a notificação
        popupStage.show();

        // Fechar a notificação após o tempo especificado
        Timeline closeTimeline = new Timeline(new KeyFrame(Duration.millis(duration), e -> popupStage.close()));
        closeTimeline.play();
    }
     
 
    
}
