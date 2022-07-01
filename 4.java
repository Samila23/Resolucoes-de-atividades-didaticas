//4 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula
//o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.


import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double CodFuncionario ,HorasTrabalhada, ValorDaHora, salario ;
		
		System.out.println("Digite o cod do colaborador");
		CodFuncionario = sc.nextDouble();
		System.out.println("Digite o total de Horas trabalhadas");
		HorasTrabalhada = sc.nextDouble();
		System.out.println("Digite o valor da hora trabalhada");
		ValorDaHora = sc.nextDouble();
		
		salario = (ValorDaHora * HorasTrabalhada );
		
		System.out.printf("Colaborador de Codigo %.2f%n tem salario igual a U$ %.2f%n", CodFuncionario, salario);
		
		sc.close();
	}

}
