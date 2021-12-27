package principal;

import Ventana.*;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de objetos a generar"));

        for (int i = 0; i < n; i++) {
            Ventana v1 = new Ventana();
            v1.setVisible(true);
        }

    }

}
