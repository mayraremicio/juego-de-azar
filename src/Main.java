import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        int numero,aleatorio,conta, contador=0;

        JOptionPane.showMessageDialog(null,"hola, bienvenido al juego de azar");

        aleatorio=(int)(Math.random()*100);


        numero=Integer.parseInt(JOptionPane.showInputDialog(" ingresa un numero "));
        contador++;




        while (numero != aleatorio )


                if (numero <aleatorio)
                    numero=Integer.parseInt(JOptionPane.showInputDialog(null, " el numero que elegiste es menor al aleatorio"));

                else

                    numero=Integer.parseInt(  JOptionPane.showInputDialog(null,"el numero que elegiste es mayor al aleatorio"));









        JOptionPane.showMessageDialog(null,"usted coincidio con el numero aleatorio  "+aleatorio);

        JOptionPane.showMessageDialog(null," las veces que lo intento fueron "+contador);




    }
}