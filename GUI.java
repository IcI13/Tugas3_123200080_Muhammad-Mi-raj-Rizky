/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame
implements ActionListener{
    double p,l,t;
    JLabel lpanjang = new JLabel("Length ");
    JLabel llebar = new JLabel("Width ");
    JLabel ltinggi = new JLabel("Height ");
    JLabel lnama = new JLabel("Cuboid Calculator");
    JLabel lresult = new JLabel("Result : ");
    JLabel lluasPP = new JLabel ("");
    JLabel lkelilingPP = new JLabel ("");
    JLabel lvolumeB = new JLabel ("");
    JLabel lluasPB = new JLabel ("");
    
    JTextField fpanjang = new JTextField();
    JTextField flebar = new JTextField();
    JTextField ftinggi = new JTextField();
    
    JButton bcount = new JButton("count");
    JButton breset = new JButton("reset");
    
    
    public GUI(){
        setTitle("Cuboid Calculator");
        setLayout(null);
        add(lnama);
        add(lpanjang);
        add(llebar);
        add(ltinggi);
        add(fpanjang);
        add(flebar);
        add(ftinggi);
        add(bcount);
        add(breset);
        add(lresult);
        add(lluasPP);
        add(lkelilingPP);
        add(lvolumeB);
        add(lluasPB);
        
        lnama.setBounds(200,30,150,50);
        lpanjang.setBounds(50,100,150,20);
        llebar.setBounds(50,170,150,20);
        ltinggi.setBounds(50,240,150,20);
        fpanjang.setBounds(150,100,100,20);
        flebar.setBounds(150,170,100,20);
        ftinggi.setBounds(150,240,100,20);
        bcount.setBounds(100,500,100,20);
        breset.setBounds(220,500,100,20);
        lresult.setBounds(100,280,100,20);
        lluasPP.setBounds(80,300,300,100);
        lkelilingPP.setBounds(80,340,300,100);
        lvolumeB.setBounds(80,380,300,100);
        lluasPB.setBounds(80,420,300,100);
        bcount.addActionListener(this);
        breset.addActionListener(this);
        
        setSize(500,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bcount){
            p = Double.parseDouble(fpanjang.getText());
            l = Double.parseDouble(flebar.getText());
            t = Double.parseDouble(ftinggi.getText());
            PersegiPanjang pp = new PersegiPanjang(p,l);
            Balok b = new Balok(p,l,t);
            lluasPP.setText("Square Area : " + pp.luas());
            lkelilingPP.setText("Square Circumference : " + pp.keliling());
            lvolumeB.setText("Cuboid Volume : " + b.volume());
            lluasPB.setText("Cuboid Surface Area : " + b.luasPermukaan());
        }
        if(e.getSource() == breset){
             lluasPP.setText("");
            lkelilingPP.setText("");
            lvolumeB.setText("");
            lluasPB.setText("");
            fpanjang.setText("");
            flebar.setText("");
            ftinggi.setText("");
        }
    }
   
}
