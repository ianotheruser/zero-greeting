import zero.App;
import zero.ui.Label;
import zero.ui.Button;
import zero.ui.Column;

public class Main extends App {
    @Override public void settings() {
        title("Greeting");
        size(420,240);
        padding(20);
    }

    @Override public void setup() {
        Label greeting = new Label("Hello, Java!");
        Button button = new Button("Say hello");
        button.onClick(() -> greeting.setText("You did it!"));
        show(new Column(10, greeting, button));
    }

    public static void main(String[] args) { launch(args); }
}