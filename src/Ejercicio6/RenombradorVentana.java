package Ejercicio6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RenombradorVentana extends JFrame implements ActionListener {

    private static RenombradorVentana ventana;
    private Box columna;
    private JButton boton1;
    private JButton boton2;

    static void main() {
        ventana = new RenombradorVentana();
    }

    public RenombradorVentana() {
        this.setTitle("Ventana para ser clickeada");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500,30,500,350);

        columna = Box.createVerticalBox();
        boton1 = new JButton("Curso basico de java");
        boton2 = new JButton("Curso avanzado de java");

        boton1.addActionListener(this);
        boton2.addActionListener(this);

        columna.add(boton1);
        columna.add(boton2);
        this.add(columna);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1){
            ventana.setTitle("Curso basico de java");
        } else if (e.getSource() == boton2) {
            ventana.setTitle("Curso avanzado de java");
        }
    }
}
