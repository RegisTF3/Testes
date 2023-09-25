/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadesteste;
import atividadesteste.view.TesteView;
import javax.swing.JFrame;
/**
 *
 * @author 182210131
 */
public class AtividadesTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TesteView Te = new TesteView();
       Te.setVisible(true);
       Te.setSize(600,700);
       Te.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
