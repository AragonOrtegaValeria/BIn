package valeriaysusbinomios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ventana1 extends JFrame implements ActionListener  {

JFrame framito; //declara componentes de la ventana
JButton bot1, bot2;
JLabel labela, labelb, labelres;
JTextField numa, numb, res; 
private int resultado = 0, calca, calab, calcb;  //declara variables
  
    //metodo para llamar a los otros.
public void llamame(){
    ventana();
    elementos();

}

public void ventana(){ //Crea la ventana con sus caracteristicas
    
    setLayout(null);
    setSize(700, 700);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   
} 
public void elementos(){   //Crea los elementos de la ventana

    bot1 = new JButton("(a-b)^2"); //crea un boton con el texto que va a mostrar, las medidas, lo agrega a la ventana y le agrega un Action Listener.
    bot1.setBounds(200, 150 , 100, 50);
    add(bot1);
    bot1.addActionListener(this); 
    
    bot2 = new JButton("(a+b)^2");
    bot2.setBounds(200, 210 , 100, 50);
    add(bot2);
    bot2.addActionListener(this); 
    
    numa = new JTextField(); //Crea campo de texto, agrega las medidas y lo agrega a la ventana
    numa.setBounds(200, 50, 50, 20);
    add(numa); 
    
    labela = new JLabel("Coeficiente de x"); //Crea un titulo para el campo de texto, da medidas y lo agrega
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
    public void actionPerformed(ActionEvent e) { //en caso de que se active
                if(e.getSource().equals(bot2)){
                    System.out.println("k"); 
                    calca = Integer.parseInt(numa.getText()); 
                    calcb = Integer.parseInt(numb.getText()); //Convierte cadena y devuelve un entero.
                    calab = 2*calca*calcb; //calab, calca y calcb realizan las operaciones
                    calca = (calca)*(calca);
                    calcb = (calcb)*(calcb);
                    res.setText(calca+"x^2 +"+calab+"xy +"+calcb+"y^2"); //devuelve el resultado
        }

            if(e.getSource().equals(bot1)){ //lo mismo pero cambia suma por resta
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

