package principal;

import javax.swing.*;
import principal.logANDres.*;

public class ProVitarrico {

    public static void main(String[] args) {
        //Inicia el hilo y llama a PantallaMain
        SwingUtilities.invokeLater(() -> {
            JFrame frameMain = new PantallaMain();
            frameMain.setResizable(false);
            frameMain.setSize(1073, 807);
            frameMain.setLocationRelativeTo(null);
            frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frameMain.setVisible(true);
        });
    }
}
