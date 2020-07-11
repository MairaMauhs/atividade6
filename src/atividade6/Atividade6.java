/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade6;

import javax.swing.JOptionPane;

/**
 *
 * @author AliraMaria
 */
public class Atividade6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Faça um algoritmo que receba o valor do raio de um circulo qualquer.
        //Calcule o perímetro do círculo (P = 2.pi.r) , a Área do circulo (A = PI . r²)
        //e o Diâmetro do círculo (D = 2 . r). Mostre os resultados.

        double r, p, a, d;
        
        r = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Raio: "));
        
        p = 2 * Math.PI * r;
        a = Math.PI * Math.pow(r, 2);
        d = 2 * r;

        
        JOptionPane.showMessageDialog(null, "O Valor do raio inserido foi de: "+r+
                "\nEntão, o valor do Perímetro sera de: "+p+ "\nO Valor da Área Do Circulo sera de: "+a+
                "\nE o valor do Diâmetro Do Circulo sera de: "+d);
        
    }
    
}
