package gui;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JButton bencrypt;
    private JTextField eingabe, secret, shift;
    private JLabel ausgabe;
    private JRadioButton secretR, shiftR;
    private JCheckBox cDecrypt;

    public View(Controller c) {
        this.setTitle("Verschl");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.bencrypt = new JButton("Encrypt");
        this.eingabe = new JTextField("eingabe");
        this.secret = new JTextField("eingabe");
        this.shift = new JTextField("eingabe");
        this.ausgabe = new JLabel("ausgabe");
        this.secretR = new JRadioButton("secret");
        this.shiftR = new JRadioButton("shift");
        this.cDecrypt = new JCheckBox("Decrypt");
        ButtonGroup b = new ButtonGroup();
        b.add(secretR);
        b.add(shiftR);

        Container center = new Container();
        center.setLayout(new GridLayout(4, 2, 5, 5));
        center.add(eingabe);
        center.add(secret);
        center.add(ausgabe);
        center.add(shift);
        center.add(secretR);
        center.add(shiftR);
        center.add(cDecrypt);

        this.setLayout(new BorderLayout());
        this.add(bencrypt, BorderLayout.SOUTH);
        this.add(center, BorderLayout.CENTER);

        shiftR.addActionListener(c);
        secretR.addActionListener(c);
        bencrypt.addActionListener(c);
       

        this.setVisible(true);
    }

    public JButton getBencrypt() {
        return bencrypt;
    }

    public void setBencrypt(JButton bencrypt) {
        this.bencrypt = bencrypt;
    }

    public JTextField getEingabe() {
        return eingabe;
    }

    public void setEingabe(JTextField eingabe) {
        this.eingabe = eingabe;
    }

    public JTextField getSecret() {
        return secret;
    }

    public void setSecret(JTextField secret) {
        this.secret = secret;
    }

    public JTextField getShift() {
        return shift;
    }

    public void setShift(JTextField shift) {
        this.shift = shift;
    }

    public JLabel getAusgabe() {
        return ausgabe;
    }

    public void setAusgabe(JLabel ausgabe) {
        this.ausgabe = ausgabe;
    }

    public JRadioButton getSecretR() {
        return secretR;
    }

    public void setSecretR(JRadioButton secretR) {
        this.secretR = secretR;
    }

    public JRadioButton getShiftR() {
        return shiftR;
    }

    public void setShiftR(JRadioButton shiftR) {
        this.shiftR = shiftR;
    }
    public JCheckBox getcDecrypt() {
        return cDecrypt;
    }

    public void setcDecrypt(JCheckBox cDecrypt) {
        this.cDecrypt = cDecrypt;
    }
    
}
