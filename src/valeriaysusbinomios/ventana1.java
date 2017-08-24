package valeriaysusbinomios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ventana1 extends JFrame implements ActionListener  {

JFrame framito; 
JButton bot1, bot2;
JLabel labela, labelb, labelres;
JTextField numa, numb, res; 
private int resultado = 0, calca, calab, calcb;  
  
    
public void llamame(){
    ventana();
    elementos();

}

public void ventana(){
    
    setLayout(null);
    setSize(700, 700);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   
} 
public void elementos(){   

    bot1 = new JButton("(a-b)^2");
    bot1.setBounds(200, 150 , 100, 50);
    add(bot1);
    bot1.addActionListener(this); 
    
    bot2 = new JButton("(a+b)^2");
    bot2.setBounds(200, 210 , 100, 50);
    add(bot2);
    bot2.addActionListener(this); 
    
    numa = new JTextField();
    numa.setBounds(200, 50, 50, 20);
    add(numa); 
    
    labela = new JLabel("Coeficiente de x");
    labela.setBounds(250, 50, 200, 20);
    add(labela);
    
    numb = new JTextField();
    numb.setBounds(200, 100, 50, 20);
    add(numb); 
    
    labelb = new JLabel("Coeficiente de y(Si es negativo, sin el signo)");
    labelb.setBounds(250, 100, 300, 20);
    add(labelb);
    
    res = new JTextField();
    res.setBounds(200, 300, 200, 20);
    add(res);
    
    labelres = new JLabel("TCP");
    labelres.setBounds(400, 300, 200, 20);
    add(labelres);
    
    setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
                if(e.getSource().equals(bot2)){
                    System.out.println("k");
                    calca = Integer.parseInt(numa.getText());
                    calcb = Integer.parseInt(numb.getText());
                    calab = 2*calca*calcb;
                    calca = (calca)*(calca);
                    calcb = (calcb)*(calcb);
                    res.setText(calca+"x^2 +"+calab+"xy +"+calcb+"y^2");
        }

            if(e.getSource().equals(bot1)){
                System.out.println("2");
                calca = Integer.parseInt(numa.getText());
                calcb = Integer.parseInt(numb.getText());
                calab = 2*calca*calcb;
                calca = (calca)*(calca);
                calcb = (calcb)*(calcb);
                res.setText(calca+"x^2 -"+calab+"xy +"+calcb+"y^2");         
            }
        
    }
}

