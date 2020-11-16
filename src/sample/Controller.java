package sample;

import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Controller {

    public ImageView setPreview;

    int currentFrame;

    public void showImage(ActionEvent actionEvent) throws FileNotFoundException {

        InputStream stream = new FileInputStream("C:\\Users\\nilsh\\IdeaProjects\\testStuff\\sequence/Sequence" + currentFrame + ".png");
        Image image = new Image(stream);
        setPreview.setImage(image);
        currentFrame++;
    }
}
