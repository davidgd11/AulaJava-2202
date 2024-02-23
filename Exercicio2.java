package br.com.fiap;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int area, base, altura;
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite a base do trângulo: ");
            base = scan.nextInt();

            System.out.println("Digite a altura do trângulo: ");
            altura = scan.nextInt();

            area = (base * altura)/2 ;

            System.out.println("A área do triângulo é: " + area );

        } catch (Exception e) {
            System.out.println("Formato incorreto");
        }
		
		
	}
}
