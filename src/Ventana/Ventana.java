package Ventana;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Ventana extends JFrame {

    private boolean ojos = false;
    private String cuerpo = "fondo.jpg";
    private boolean orejas = false;
    private int LOCALIZACION = 0;

    public void setOjos(boolean ojos) {
        this.ojos = ojos;
    }

    public void setOrejas(boolean orejas) {
        this.orejas = orejas;
    }

    public Ventana() {
        this.setSize(500, 500);//Estableci el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);//deja de run el proyecto al cerrar
        iniciarComponentes();//mando llamar el metodo
    }

    private void iniciarComponentes() {
        JLayeredPane panel = new JLayeredPane();//Creacion panel
        panel.setLayout(null);//desactivo configuracion de panel
        this.getContentPane().add(panel);//agrego panel a ventana

        JLabel fondo = new JLabel(new ImageIcon(cuerpo));//creo la etiqueta con la imagen de fondo
        fondo.setBounds(0, 0, 500, 500);//lo acomodo

        ImageIcon imagen = new ImageIcon("lentes.png");//creo la imagen ojos
        JLabel lentes = new JLabel();//creo la etiqueta
        lentes.setBounds(90, 0, 500, 500);//acomodo la etiqueta
        lentes.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(320, 400, Image.SCALE_SMOOTH)));//meto la imagen a la etiqueta con la escala

        ImageIcon imagen2 = new ImageIcon("audifonos.png");//creo la imagen
        JLabel orejas = new JLabel();//creo la etiqueta
        orejas.setBounds(-0, -60, 500, 500);//acomodo la etiqueta
        orejas.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(500, 380, Image.SCALE_SMOOTH)));

        randomOjos();
        if (this.ojos == true) {
            panel.add(lentes);//añado a el panel
        } else {
        }
        randomOrejas();
        if (this.orejas == true) {
            panel.add(orejas);
        } else {
        }
        panel.add(fondo);//añado al panel 

    }

    private void randomOjos() {
        int random = (int) (Math.random() * 1.5);//Ojos
        if (random == 0) {
            this.ojos = true;
        } else {
        }
    }

    private void randomOrejas() {
        int random1 = (int) (Math.random() * 3);//Ojos
        if (random1 == 0) {
            this.orejas = true;
        } else {
        }

    }

}
