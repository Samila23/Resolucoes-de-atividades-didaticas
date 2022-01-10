//5 - Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2,
//o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double Cod01 , Quant01 , Valor01, Cod02 , Quant02 , Valor02, Total;
		
		System.out.println("Digite na ordem, Cod do produto, Quantidade de itens do mesmo produto, Valor do Produto");
		Cod01 = sc.nextDouble();
		Quant01 = sc.nextDouble();
		Valor01 = sc.nextDouble();
		System.out.println("Digite na ordem, Cod do produto, Quantidade de itens do mesmo produto, Valor do Produto");
		Cod02 = sc.nextDouble();
		Quant02 = sc.nextDouble();
		Valor02 = sc.nextDouble();
		
		Total = (Valor01 * Quant01) + (Valor02 * Quant02 );
		
		System.out.printf("O total a pagar é de R$ %.2f%n", Total);
		sc.close();
		
	}

}
