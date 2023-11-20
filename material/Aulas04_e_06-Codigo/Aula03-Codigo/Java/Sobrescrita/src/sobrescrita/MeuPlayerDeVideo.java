 // Example 21.7: MediaTest.java
// A simple media player
package sobrescrita;

//import javax.print.attribute.standard.Media;
import javax.swing.JFileChooser;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class MeuPlayerDeVideo extends MeuPlayer {

    public void Toca(String sFileName) {
        String[] s = new String[0];
        VideoPlayer.main(s);

    } // end outer if

} // end class MediaTest
