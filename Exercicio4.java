package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int a, b, c;
		double x1, x2, delta;
		String aux;
		
		try {
			
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'a' "));
			b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'b' "));
			c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'c' "));
			
			delta = ((b)*(b) - 4 * (a) * (c));
			JOptionPane.showMessageDialog(null, delta);
			
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			JOptionPane.showMessageDialog(null,"S= {" + x1 + "," + x2 + "}" );
			
			
		} catch (Exception e) {
			System.out.println("Formato errado!");
		}

	}

}
