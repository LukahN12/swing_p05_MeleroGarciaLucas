package Ejercicio5;

import Ejercicio4.LectorTexto;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class LectorTexto2 extends JFrame implements FocusListener {
    private JTextField campoTexto;
    private JPasswordField campoPassword;
    private static LectorTexto2 ventana;

    public static void main(String[] args) {
        ventana = new LectorTexto2();
        ventana.setVisible(true);
    }

    public LectorTexto2() {

        this.setTitle("Detectar perdida de foco");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 10, 500, 400);
        this.setLayout(null);

        campoTexto = new JTextField();
        campoPassword = new JPasswordField();

        campoTexto.setBounds(100, 100, 250, 30);
        campoPassword.setBounds(100, 180, 250, 30);

        campoTexto.addFocusListener(this);
        campoPassword.addFocusListener(this);

        this.add(campoTexto);
        this.add(campoPassword);
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {
        if (!e.isTemporary()) {
            JOptionPane.showMessageDialog(null,
                    "cuadro1: " + campoTexto.getText() +
                            "\ncuadro2: " + new String(campoPassword.getPassword()));
        }
    }
}
