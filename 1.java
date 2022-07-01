// 1 -Faça um programa para ler a entrada de dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US); // Para Digitar com o ponto flutuante 2.2
		Scanner sc = new Scanner (System.in); // Para que seja possivel a entrada de dados
		
		int a, b, soma;
		
		
		System.out.println ("Digite o primeiro numero a ser somado");
		a = sc.nextInt(); //variavel que será armazenada a entrada de dados
		
		System.out.println ("Digite o segundo numero a ser somado");
		b = sc.nextInt(); //variavel que será armazenada a entrada de dados
		
		soma= a+ b;
		
		System.out.println("A soma dos numeros digitados é " + soma);
		
		sc.close(); // é sempre necessário encerrar o sc de entrada de dados
	}

}
