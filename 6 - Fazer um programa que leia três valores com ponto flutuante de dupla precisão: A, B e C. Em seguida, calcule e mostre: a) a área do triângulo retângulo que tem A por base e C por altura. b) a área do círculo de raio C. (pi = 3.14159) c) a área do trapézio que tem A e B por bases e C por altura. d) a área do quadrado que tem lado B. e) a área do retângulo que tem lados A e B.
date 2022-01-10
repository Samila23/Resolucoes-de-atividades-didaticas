//6 - Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double pi = 3.14159, a , b, c,TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO ,  RETANGULO ;
		
		System.out.println("Digite a base");
		a = sc.nextDouble();
		System.out.println("Digite a base");
		b = sc.nextDouble();
		System.out.println("Digite a Altura");
		c = sc.nextDouble();
		
		TRIANGULO = (a * c) / 2;
		CIRCULO = (pi * (c * c));
		TRAPEZIO = ( (a + b) * c) / 2;
		QUADRADO = (b * b);
		RETANGULO = (a * b);
		

		System.out.printf("Triangulo %.3f%n",TRIANGULO  );
		System.out.printf("Circulo = %.4f%n",CIRCULO );
		System.out.printf("Trapezio = %.4f%n",TRAPEZIO );
		System.out.printf("Quadrado = %.4f%n",QUADRADO );
		System.out.printf("Retangulo = %.4f%n",RETANGULO );
		sc.close();
		
		
	}

}
