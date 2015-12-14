package boletin10_2;

import javax.swing.JOptionPane;

public class Clase10_2 {
    public int numJugador() {
    return Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero para acertar: "));
    }

    public int numAciertos() {
        int numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de intentos entre 2 y 20 : "));
        while (numIntentos < 2 || numIntentos > 20) {
            numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de intentos entre 2 y 20: "));
        }
        return numIntentos;
    }

    public void juego() {
        int numAdi = (int)(Math.floor(Math.random()*(50-1)+1));
        int intentos = numAciertos();
        int numJug;
        int i = 0;
        
        
        do {
            if (i == intentos) {
                JOptionPane.showMessageDialog(null, "Los intentos se han agotado.\nHas perdido :(");
                break;}
            numJug = numJugador();
            if (numJug == numAdi) {
                JOptionPane.showMessageDialog(null, "Has acertado, ¡¡¡¡Congratulations!!!!");
                break;}
                else if (Math.abs(numAdi-numJug)>20) {
                JOptionPane.showMessageDialog(null, "Moi lonxe");} 
                else if(Math.abs(numAdi-numJug)>=10 && Math.abs(numAdi-numJug)<=20){ 
                JOptionPane.showMessageDialog(null, "Lonxe"); }           
                else if (Math.abs(numAdi-numJug)<10 && Math.abs(numAdi-numJug)>5) {
                JOptionPane.showMessageDialog(null, "preto");}
                else          
                JOptionPane.showMessageDialog(null, "moi preto");
            i++;}
         while (numJug != numAdi);

    }
    
}

