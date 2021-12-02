/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

/**
 *
 * @author user
 */
public class GuiTest extends JFrame{
    private JLabel jLabelTitle;
    
    public GuiTest() {
        initComponent();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiTest().setVisible(true);
            }
        });
        
    }

    private void initComponent() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(400,250));
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
       
        getContentPane().add(getTitlePanel());
        JTextField jTextFieldNewTextTitle = new JTextField("");
        jTextFieldNewTextTitle.setMaximumSize(new Dimension(200,27));
        jTextFieldNewTextTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        getContentPane().add(jTextFieldNewTextTitle);
        JButton jButtonChangeTitleText = new JButton("Нажми меня");
        jButtonChangeTitleText.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonChangeTitleText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabelTitle.setText(jTextFieldNewTextTitle.getText());
            }
        });
        getContentPane().add(jButtonChangeTitleText);
        
    }
    private JPanel getTitlePanel(){
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.X_AXIS));
        titlePanel.setMaximumSize(new Dimension(400, 50));
//        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK);
//        titlePanel.setBorder(lineBorder);
        titlePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabelTitle = new JLabel("Hello, SKTVp20!");
        jLabelTitle.setMinimumSize(new Dimension(400,27));
        jLabelTitle.setPreferredSize(jLabelTitle.getMinimumSize());
        jLabelTitle.setHorizontalAlignment(JLabel.CENTER);
        jLabelTitle.setFont(new Font("Tahoma",1,14));
//        jLabelTitle.setBorder(lineBorder);
        titlePanel.add(jLabelTitle);
        return titlePanel;
    }
    
}
