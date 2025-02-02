import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
// to be used through this activity
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;


public class SetupActivity extends Application {
    @Override
    public void start(final Stage stage) {
        // update this method definition to complete this activity
	stage.setTitle("CS400: The Key");
	Label quoteLabel = new Label("    The key to making programs fast\n"+
				     "    is to make them do practically nothing.\n"+
				     "    -- Mike Haertel");
	Circle c = new Circle(160,120,30);
	Polygon p = new Polygon(160,120,200,220,120,220);
        Group group = new Group(quoteLabel,c,p);
        Scene scene = new Scene(group,320,240);

	
	
	stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch();
    }
}
