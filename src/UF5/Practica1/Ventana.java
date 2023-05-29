package UF5.Practica1;


import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana (){
        setSize(500,500);
        iniciarcomponentes();
    }

    public void iniciarcomponentes(){
        //Creamos el panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane() .add(panel);

        //Creamos los botones
        //Boton 1
        JButton boton1 = new JButton("Click");
        boton1.setBounds(100,100,100,40);
        boton1.setForeground(Color.BLUE);
        boton1.setFont(new Font("cooper black",3,20));
        panel.add(boton1);

        //Boton2
        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,40);
        ImageIcon click = new ImageIcon("h.png");
        boton2.setIcon(new ImageIcon(click.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));

        panel.add(boton2);
    }

}
