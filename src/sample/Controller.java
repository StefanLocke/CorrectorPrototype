package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Controller {


    private boolean topShow = false;
    private boolean botShow = false;
    public Pane topPane;
    public Button topButtonHidden;
    public Button topButtonActive;
    public Button botButtonHidden;
    public Button botButtonActive;
    public Pane bottomPane;
    public ListView leftList;
    public ListView rightList;

    public void toggleTop() throws IOException {
        topPane.setVisible(!topShow);
        topButtonHidden.setVisible(topShow);
        topShow = !topShow;

    }

    public void toggleBottom() throws IOException {
        bottomPane.setVisible(!botShow);
        botButtonHidden.setVisible(botShow);
        botShow = !botShow;

    }


}
