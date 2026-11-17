package Ejercicio8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraAlt extends JFrame implements ActionListener {
    private final JTextField campoPrimerNumero;
    private final JTextField campoSegundoNumero;
    private final JTextField campoResultado;
    private final JButton botonSuma;

    public static void main(String[] args) {
        CalculadoraAlt calculadoraAltS = new CalculadoraAlt();
    }

    public CalculadoraAlt() {
        setTitle("Ejercicio 8 - Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 100, 430, 250);
        setLayout(null);

        campoPrimerNumero = new JTextField();
        campoSegundoNumero = new JTextField();
        campoResultado = new JTextField();
        campoResultado.setEditable(false);
        botonSuma = new JButton("Suma");

        campoPrimerNumero.setBounds(30, 30, 150, 30);
        campoSegundoNumero.setBounds(220, 30, 150, 30);
        botonSuma.setBounds(145, 85, 120, 35);
        campoResultado.setBounds(130, 145, 150, 30);

        campoPrimerNumero.setToolTipText("Primer número");
        campoSegundoNumero.setToolTipText("Segundo número");
        campoResultado.setToolTipText("Resultado de la suma");
        botonSuma.setToolTipText("Suma los dos valores (ALT+S o CTRL+S)");

        Icon iconoSuma = UIManager.getIcon("OptionPane.informationIcon");
        botonSuma.setIcon(iconoSuma);
        botonSuma.addActionListener(this);

        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("alt S"), "accionSuma");
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("ctrl S"), "accionSuma");
        getRootPane().getActionMap().put("accionSuma", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonSuma.doClick();
            }
        });

        add(campoPrimerNumero);
        add(campoSegundoNumero);
        add(botonSuma);
        add(campoResultado);

        // Mostrar la ventana después de crear y añadir todos los componentes.
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String primerTexto = campoPrimerNumero.getText().trim();
        String segundoTexto = campoSegundoNumero.getText().trim();

        try {
            double primerNumero = Double.parseDouble(primerTexto);
            double segundoNumero = Double.parseDouble(segundoTexto);
            campoResultado.setText(String.valueOf(primerNumero + segundoNumero));
        } catch (NumberFormatException error) {
            campoResultado.setText("");
            JOptionPane.showMessageDialog(this,
                    "Introduce un número válido en cada campo.",
                    "Datos no válidos", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
