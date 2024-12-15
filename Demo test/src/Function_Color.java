import java.awt.Color;

public class Function_Color {
    App app;

    public Function_Color(App app) {
        this.app = app;
    }

    public void changeColor(String color) {
        switch (color) {
            case "White":
                app.window.getContentPane().setBackground(Color.white);
                app.textArea.setBackground(Color.white);
                app.textArea.setForeground(Color.BLACK);
                break;
            case "Black":
                app.window.getContentPane().setBackground(Color.BLACK);
                app.textArea.setBackground(Color.BLACK);
                app.textArea.setForeground(Color.white);
                break;
            case "Blue":
                app.window.getContentPane().setBackground(new Color(28, 186, 186));
                app.textArea.setBackground(new Color(28, 186, 186));
                app.textArea.setForeground(Color.WHITE);
                break;
            default:
                break;
        }
    }
}
