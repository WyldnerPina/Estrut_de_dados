package View;
import java.util.Scanner;
import Controller.RecursividadeController;


public class Aula01Recursividade {

	public static void main(String[] args) {
		RecursividadeController rec = new RecursividadeController();
		Scanner ler = new Scanner(System.in);
		int opc; //apoio = 0;

		do {			
			System.out.println(""
					+ "+-------------------------------------------+\n"
					+ "|        AULA 1 - RECURSIVIDADE             |\n"
					+ "|   Escolha uma opção para mostrar códigos  |\n"
					+ "|   1 - Exemplos da aula                    |\n"
					+ "|   2 - Exercicio da aula                   |\n"
					+ "|   3 - Exercicios 1 e 3 para entregar      |\n"
					+ "|   4 - Exercicios 4 (Binario)              |\n"
					+ "|   9 - Sair                                |\n"
					+ "+-------------------------------------------+\n");
			opc = ler.nextInt();		
			
			switch (opc) {
			case 1: // EXEMPLO 1
				int divisao;
				divisao = rec.divisao(27, 3);
				System.out.println("O resultado eh: " + divisao);
				System.out.println("===========================================================");

				// EXEMPLO 2
				int potencia;
				potencia = rec.potencia(2, 3);
				System.out.println("O resultado eh: " + potencia);
				System.out.println("===========================================================");

				// EXEMPLO 3
				int TAM = 10, somaTotal;
				int somaVet[] = new int[TAM];
				somaTotal = rec.soma(somaVet, TAM);
				System.out.println("O resultado eh: " + somaTotal);
				System.out.println("===========================================================");
//				opc = continuar(apoio);
				System.exit(0);
				break;
				
//=====================================================================================================
//=====================================================================================================
			case 2: // EXERCÍCIO EM AULA

				int fat = 5, resultado;

				resultado = rec.RecursividadeFatorial(fat);
				System.out.println("O resultado eh: " + resultado);
				System.out.println("===========================================================");
//				opc = continuar(apoio);
				System.exit(0);
				break;
				
//=====================================================================================================
//=====================================================================================================
			case 3: // TAREFA 01 - exercicios 1 e 3
				int num;
				double result;
				Scanner le = new Scanner(System.in);
				
				System.out.println("Digite um numero");
				num = le.nextInt();
				le.close();
				
				result = rec.Exerc01Somatorio(num);
				System.out.println("O resultado da somatoria eh: " + result);


				System.out.println("===========================================================");
				result = rec.Exerc03SomatorioMenor(num);
				System.out.println("O resultado da soma eh: " + result);
//				opc = continuar(apoio);
				System.exit(0);
				break;
				
			case 4: // TAREFA 01 - exercicios 2
				int wyl;				
				Scanner l = new Scanner(System.in);
				do {				
					System.out.println("Digite um numero");
					wyl = l.nextInt();
					l.close();				
				}while(wyl<0 && wyl>2000);
				
			    System.out.println(rec.binario(wyl));
				System.out.println("===========================================================");
				System.exit(0);
				break;
				
//=====================================================================================================
//=====================================================================================================
			case 9:
				System.out.println("Thanks!!");
				break;
				
//=====================================================================================================
//=====================================================================================================
			default:
				System.out.println("Pfv, só os numeros indicados");
			}
		} while (opc != 9);
		ler.close();
	}
	

// AINDA NÃO TERMINEI FUNÇÃO PRA PERGUNTAR SE A PESSOA QUER OU NÃO CONTINUAR APÓS A EXECUÇÃO DE UMA
// DAS TAREFAS
//=====================================================================================================
//=====================================================================================================	
//	public static int continuar(int retorno){
//		int resp;
//		Scanner lendo = new Scanner(System.in);
//		
//		do{
//			System.out.println("Deseja continuar?");
//			System.out.println("1 = yes");
//			System.out.println("2 = no");
//			
//			resp = lendo.nextInt();
//			lendo.close();
//			
//			if(resp == 1) {
//				retorno = 8;
//				return retorno;
//			}
//			else if(resp == 2){
//				retorno = 9;
//				return retorno;
//			}
//			else {
//				System.out.println("Somente os valores apresentados");
//			}			
//		}while(resp != 1 || resp != 2);
//		return 0;
//	}
}

