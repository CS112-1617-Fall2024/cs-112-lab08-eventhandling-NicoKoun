module edu.miracosta.cs112.lab08eventhandling {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.miracosta.cs112.lab08eventhandling to javafx.fxml;
    exports edu.miracosta.cs112.lab08eventhandling;
}