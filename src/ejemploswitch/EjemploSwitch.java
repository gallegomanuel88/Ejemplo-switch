package ejemploswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class EjemploSwitch {

    public static void main(String[] args) {
        String res = JOptionPane.showInputDialog("Teclea numero del dia");
        int dia = Integer.parseInt(res);
        switch (dia){
            case 1: JOptionPane.showMessageDialog(null, "lunes");
                break;
            case 2: JOptionPane.showMessageDialog(null, "Es martes");
                break;
            case 3: JOptionPane.showMessageDialog(null, "Es miercoles");
                break;
            case 4: JOptionPane.showMessageDialog(null, "Es jueves");
                break;
            case 5: JOptionPane.showMessageDialog(null, "Es viernes");
                break;
            case 6: JOptionPane.showMessageDialog(null, "Es sabado");
                break;
            case 7: JOptionPane.showMessageDialog(null, "Es domingo");
                break;
            default :JOptionPane.showMessageDialog(null, "Teclea un numero del 1 al 7");
            }
        JOptionPane.showMessageDialog(null, "Esta bien hecho el switch");
    }
}