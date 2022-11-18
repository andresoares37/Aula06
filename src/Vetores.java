import java.util.Iterator;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double[] alunos = new double[5];
		double total = 0;
		double media = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Por favor, digite o consumo do " + (i + 1) + "º aluno");
			alunos[i] = leitor.nextDouble();
			total += alunos[i];
			media = total / alunos.length;
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("O aluno " + (i + 1) + " consumiu R$" + alunos[i]);
		}	
				
		System.out.println("O total de consumo foi de R$" + total);
		System.out.println("A média de consumo foi de R$" + media);

		leitor.close();

	}

}
