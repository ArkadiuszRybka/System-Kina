package main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

public class Home extends JFrame{
    private JPanel MainPanel;
    private JTabbedPane tabbedPane1;
    private JTable table1;
    private JButton kupButton1;
    private JButton następnyDzieńButton1;
    private JTable table2;
    private JButton poprzedniDzieńButton2;
    private JButton następnyDzieńButton2;
    private JTable table3;
    private JButton poprzedniDzieńButton3;
    private JButton następnyDzieńButton3;
    private JTable table4;
    private JButton poprzedniDzieńButton4;
    private JButton następnyDzieńButton4;
    private JButton poprzedniDzieńButton5;
    private JButton kupButton5;
    private JLabel Label2;
    private JLabel Label1;
    private JPanel JPanel;
    private JLabel Label4;
    private JLabel Label5;
    private JTable table5;
    private JLabel Label3;
    public JLabel userlabel;
    private JButton kupButton2;
    private JButton kupButton3;
    private JButton kupButton4;
    private JButton wylogujSięButton;

    int row1=-1,column1=-1;
    int row2=-1,column2=-1;
    int row3=-1,column3=-1;
    int row4=-1,column4=-1;
    int row5=-1,column5=-1;

    public static void main (String[] args){
        Home home = new Home();

    }

    public Home() {
        super("Terminarz");
        this.setVisible(true);
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(405, 300);
        this.setLocationRelativeTo(null);

        LocalDate ld = LocalDate.now();
        Label1.setText(String.valueOf(ld.plusDays(1)));
        Label2.setText(String.valueOf(ld.plusDays(2)));
        Label3.setText(String.valueOf(ld.plusDays(3)));
        Label4.setText(String.valueOf(ld.plusDays(4)));
        Label5.setText(String.valueOf(ld.plusDays(5)));

        createTable();

        kupButton1.setEnabled(false);
        kupButton2.setEnabled(false);
        kupButton3.setEnabled(false);
        kupButton4.setEnabled(false);
        kupButton5.setEnabled(false);

        table1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                row1 = table1.getSelectedRow(); // select a row
                column1 = table1.getSelectedColumn(); // select a column
                kupButton1.setEnabled(true);
            }
        });

        kupButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(column1==0) JOptionPane.showMessageDialog(null, "Wybierz godzine");
                else if(row1!=-1) {
                    Buy buy = new Buy();
                    buy.daneLabel.setText(Label1.getText() + " - " + table1.getValueAt(row1, 0) + " - " + table1.getValueAt(row1, column1));
                }
            }
        });


        table2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                row2 = table2.getSelectedRow(); // select a row
                column2 = table2.getSelectedColumn(); // select a column
                kupButton2.setEnabled(true);
            }
        });

        kupButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(column2==0) JOptionPane.showMessageDialog(null, "Wybierz godzine");
                else if(row2!=-1) {

                    Buy buy = new Buy();
                    buy.daneLabel.setText(Label2.getText() + " - " + table2.getValueAt(row2, 0) + " - " + table2.getValueAt(row2, column2));
                }
            }
        });

        table3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                row3 = table3.getSelectedRow(); // select a row
                column3 = table3.getSelectedColumn(); // select a column
                kupButton3.setEnabled(true);
            }
        });

        kupButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(column3==0) JOptionPane.showMessageDialog(null, "Wybierz godzine");
                else if(row3!=-1) {
                    Buy buy = new Buy();
                    buy.daneLabel.setText(Label3.getText() + " - " + table3.getValueAt(row3, 0) + " - " + table3.getValueAt(row3, column3));

                }
            }
        });

        table4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                row4 = table4.getSelectedRow(); // select a row
                column4 = table4.getSelectedColumn(); // select a column
                kupButton4.setEnabled(true);
            }
        });

        kupButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(column4==0) JOptionPane.showMessageDialog(null, "Wybierz godzine");
                else if(row4!=-1) {
                    Buy buy = new Buy();
                    buy.daneLabel.setText(Label4.getText() + " - " + table4.getValueAt(row4, 0) + " - " + table4.getValueAt(row4, column4));
                }
            }
        });

        table5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                row5 = table5.getSelectedRow(); // select a row
                column5 = table5.getSelectedColumn(); // select a column
                kupButton5.setEnabled(true);
            }
        });

        kupButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(column5==0) JOptionPane.showMessageDialog(null, "Wybierz godzine");
                else if(row5!=-1) {
                    Buy buy = new Buy();
                    buy.daneLabel.setText(Label5.getText() + " - " + table5.getValueAt(row5, 0) + " - " + table5.getValueAt(row5, column5));
                }
            }
        });


        następnyDzieńButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(1);
            }
        });
        następnyDzieńButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(2);
            }
        });
        następnyDzieńButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(3);
            }
        });
        następnyDzieńButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(4);
            }
        });

        poprzedniDzieńButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(0);
            }
        });
        poprzedniDzieńButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(1);
            }
        });
        poprzedniDzieńButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(2);
            }
        });
        poprzedniDzieńButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(3);
            }
        });


        wylogujSięButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start start = new Start();
                dispose();
            }
        });
    }







    private void createTable(){
        Object [][] dane = {
                {"Avatar: Isota wody",9.15,14.15,19.15},
                {"M3GAN",9.35,15.15,22.15},
                {"Kot w Butach",10.45,15.45,18.15}
        };

        table1.setModel(new DefaultTableModel(
                dane,
                new String[]{"Tytuł", "Przed południem","Po południu", "Wieczorem"}
        ));
        table1.setRowSelectionAllowed(false);
        table1.setCellSelectionEnabled(true);

        table2.setModel(new DefaultTableModel(
                dane,
                new String[]{"Tytuł", "Przed południem","Po południu", "Wieczorem"}
        ));
        table2.setRowSelectionAllowed(false);
        table2.setCellSelectionEnabled(true);

        table3.setModel(new DefaultTableModel(
                dane,
                new String[]{"Tytuł", "Przed południem","Po południu", "Wieczorem"}
        ));
        table3.setRowSelectionAllowed(false);
        table3.setCellSelectionEnabled(true);

        table4.setModel(new DefaultTableModel(
                dane,
                new String[]{"Tytuł", "Przed południem","Po południu", "Wieczorem"}
        ));
        table4.setRowSelectionAllowed(false);
        table4.setCellSelectionEnabled(true);

        table5.setModel(new DefaultTableModel(
                dane,
                new String[]{"Tytuł", "Przed południem","Po południu", "Wieczorem"}
        ));
        table5.setRowSelectionAllowed(false);
        table5.setCellSelectionEnabled(true);
    }

}
