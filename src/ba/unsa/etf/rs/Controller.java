package ba.unsa.etf.rs;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller {
    public TextField polje;
    public Label labela;
    public void pretvori(KeyEvent keyEvent) {
        String s=polje.getText();
        //s=s.toUpperCase();
        String najduza="";
        for (String rijec: s.split(" ")) {
            boolean rij=true;
            try {
                int x= Integer.parseInt(rijec);
            }catch (NumberFormatException e){
                rij=false;
            }
            if (rijec.length() > najduza.length() && !rij)
                najduza = rijec;
        }
        String s1="";
        for (String rijec: s.split(" ")) {
            if (rijec.contentEquals(najduza)) {
                najduza=najduza.toUpperCase();
                s1 += najduza+" ";
                continue;
            }
            s1+=rijec+" ";
        }
        labela.setText(s1);
    }
}
