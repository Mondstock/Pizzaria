package pizzaria.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Douglas
 */
public class ControladorPrincipal {
    
    public static void main(String[] args) {
        try {
            ControladorTelaPrincipal p = new ControladorTelaPrincipal();
            p.abrirTela();
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
}
