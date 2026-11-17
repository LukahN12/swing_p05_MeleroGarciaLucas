package Ejercicio2;

import Ejercicio3.DetectorDeArrastre;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DetectorDeClick extends JFrame implements MouseListener {

    private static DetectorDeClick ventana;

    static void main() {
        ventana = new DetectorDeClick();
    }

    public DetectorDeClick(){
        this.setTitle("Ventana para ser clickeada");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500,30,500,350);
        this.addMouseListener(this);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){
            JOptionPane.showMessageDialog(null, "Has presionado el boton izquierdo");
        } else if (e.getButton() == MouseEvent.BUTTON3){
            JOptionPane.showMessageDialog(null, "Has presionado el boton derecho");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
