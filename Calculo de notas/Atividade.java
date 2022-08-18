package br.com.dio;

import java.util.Locale;
import java.util.Scanner;

public class mainTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double nota01, nota02, nota03, notaPonderada, notaAritmetica;
		String tipoNota, tipoConceito;
		
		System.out.println("Digite a nota 01");
		nota01 = sc.nextDouble();
		System.out.println("Digite a nota 02");
		nota02 = sc.nextDouble();
		System.out.println("Digite a nota 03");
		nota03 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Para Nota Aritmética digite A, Para nota ponderada digite P");
		tipoNota = sc.nextLine();
		
		switch (tipoNota) {
		case "A":
			notaAritmetica = notaA(nota01,nota02, nota03); 
			tipoConceito = conceito(notaAritmetica);
			System.out.println("Média Aritmética é : " + tipoConceito);
			break;
		case "a":
			notaAritmetica = notaA(nota01,nota02, nota03); 
			tipoConceito = conceito(notaAritmetica);
			System.out.println("Média Aritmética é : " + tipoConceito);
			break;
		case "P":
			notaPonderada = notaP(nota01, nota02, nota03);
			tipoConceito = conceito(notaPonderada);
			System.out.println("Média Ponderada é : " + tipoConceito);
			break;
		case "p":
			notaPonderada = notaP(nota01, nota02, nota03);
			tipoConceito = conceito(notaPonderada);
			System.out.println("Média Ponderada é : " + tipoConceito);
			break;
		default :
			System.out.println("Digite uma opção válida");
			break;
		}
	}
	
	
	public static double notaA(double nota01, double nota02 , double nota03) {
		double notaAritmetica = (nota01 + nota02 + nota03) / 3;
		return notaAritmetica;
	}
	
	public static double notaP(double nota01, double nota02 , double nota03) {
		double notaPonderada = ((nota01 * 2) + (nota02 * 4) + (nota03 * 6)) / 12; 
		return notaPonderada;
	}
	
	public static String conceito(double media) {
		if (media >= 0 && media < 5.0) {
			return "D";
		}
		if (media >= 5.0 && media < 7.0) {
			return "C";
		}
		if (media >= 7.0 && media < 9.0 ) {
			return "B";
		}
		if (media >= 9.0) {
			return "A";
		}
		//Caso a média esteja abaixo de 0 Ou acima de 10, algo nas notas está incorreto.
		return "Verifique as notas indicadas, algo está incorreto.";
	}
}
