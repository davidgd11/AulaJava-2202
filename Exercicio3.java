package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int b, B, altura, area;
		String aux;
		
		try {
			
			b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base menor do trapézio: ")); 
			B = Integer.parseInt(JOptionPane.showInputDialog("Digite a base maior do trapézio: "));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do trapézio: "));
			
			area = ((b + B) * altura) /2;
			
			JOptionPane.showMessageDialog(null, "A área do trapézio é: " + area);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto");
		}

	}

}
