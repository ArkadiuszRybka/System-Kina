package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Buy extends JFrame{
    private JPanel MainPanel;
    public JLabel daneLabel;
    private JTabbedPane tabbedPane1;
    private JTextField blikField;
    private JButton zaplacButton;
    private JTextField data1;
    private JTextField data2;
    private JTextField kod;
    private JTextField nr1;
    private JTextField nr2;
    private JTextField nr3;
    private JTextField nr4;
    private JButton zaplac2Button;
    private JButton anulujButton;
    private JButton anulujButton1;

    public static void main(String[] args){
        Buy buy = new Buy();
    }

    public Buy(){
        super("Transakcja");
        this.setVisible(true);
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,300);
        this.setLocationRelativeTo(null);
        int timeVisible = 3000;

        zaplacButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(blikField.getText().length()!=6) JOptionPane.showMessageDialog(null,"Błędny kod");

                else {
                    JOptionPane.showMessageDialog(null, "Potwierdź płatność w aplikacji bankowej i potem kliknij OK");
                    JOptionPane pane = new JOptionPane("Przetwarzanie płatności...",
                            JOptionPane.INFORMATION_MESSAGE);
                    JDialog dialog = pane.createDialog(null, "Powiadomienie");
                    dialog.setModal(false);
                    dialog.setVisible(true);

                    new Timer(timeVisible, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dialog.setVisible(false);
                        }
                    }).start();
                    setTimeout(() -> JOptionPane.showMessageDialog(null, "Transakcja zakończona \n Bilet został przesłany na maila"), 3000);
                    setTimeout(() -> dispose(), 3500);

                }
            }
        });

        zaplac2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nr1.getText().length()!=4 || nr2.getText().length()!=4 || nr3.getText().length()!=4 || nr4.getText().length()!=4) JOptionPane.showMessageDialog(null,"Błędny numer karty");
                else if(data1.getText().length()!=2 || data2.getText().length()!=2) JOptionPane.showMessageDialog(null,"Błedną ważność karty");
                else if(kod.getText().length()!=3) JOptionPane.showMessageDialog(null,"Błedny kod weryfikujący");
                else{
                    JOptionPane.showMessageDialog(null, "Potwierdź płatność w aplikacji bankowej i potem kliknij OK");
                    JOptionPane pane = new JOptionPane("Przetwarzanie płatności...",
                            JOptionPane.INFORMATION_MESSAGE);
                    JDialog dialog = pane.createDialog(null, "Powiadomienie");
                    dialog.setModal(false);
                    dialog.setVisible(true);

                    new Timer(timeVisible, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dialog.setVisible(false);
                        }
                    }).start();
                    setTimeout(() -> JOptionPane.showMessageDialog(null, "Transakcja zakończona \n Bilet został przesłany na maila"), 3000);
                    setTimeout(() -> dispose(), 3500);

                }
            }
        });

        blikField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
                    blikField.setEditable(blikField.getText().length() < 6);
                }
                else{
                    blikField.setEditable(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE);
                }
            }
        });

        nr1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
                    nr1.setEditable(nr1.getText().length() < 4);
                }
                else{
                    nr1.setEditable(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE);
                }
            }
        });

        nr2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
                    nr2.setEditable(nr2.getText().length() < 4);
                }
                else{
                    nr2.setEditable(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE);
                }
            }
        });

        nr3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
                    nr3.setEditable(nr3.getText().length() < 4);
                }
                else{
                    nr3.setEditable(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE);
                }
            }
        });

        nr4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
                    nr4.setEditable(nr4.getText().length() < 4);
                }
                else{
                    nr4.setEditable(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE);
                }
            }
        });


        data1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
                    data1.setEditable(data1.getText().length() < 2);
                }
                else{
                    data1.setEditable(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE);
                }
            }
        });

        data2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
                    data2.setEditable(data2.getText().length() < 2);
                }
                else{
                    data2.setEditable(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE);
                }
            }
        });
        kod.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
                    kod.setEditable(kod.getText().length() < 3);
                }
                else{
                    kod.setEditable(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE);
                }
            }
        });

        anulujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        anulujButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void setTimeout(Runnable runnable, int opoznienie){
        new Thread(() -> {
            try {
                Thread.sleep(opoznienie);
                runnable.run();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }).start();
    }

}
