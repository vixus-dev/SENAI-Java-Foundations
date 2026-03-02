package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class OlaMundoFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. Criar um Label com o texto "Olá Mundo!"
        Label label = new Label("Odeio JavaFX");

        // 2. Criar um layout (StackPane) e adicionar o Label a ele
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // 3. Criar uma Scene com o layout e definir suas dimensões
        Scene scene = new Scene(root, 300, 200);

        // 4. Configurar o Stage (a janela)
        primaryStage.setTitle("Meu Primeiro JavaFX"); // Título da janela
        primaryStage.setScene(scene);                // Definir a Scene na janela
        primaryStage.show();                         // Mostrar a janela
    }

    public static void main(String[] args) {
        launch(args); // Inicia o aplicativo JavaFX
    }
}
