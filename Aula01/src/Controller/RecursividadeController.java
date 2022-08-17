package Controller;

public class RecursividadeController {
	public RecursividadeController() {
		super();
	}

//================================== EXEMPLO 1 =======================================
//====================================================================================	
	public int divisao(int dividendo, int divisor) {
		if (dividendo < divisor) {
			return 0;//0 ou 1
		} else {
			dividendo = dividendo - divisor;
			return 1 + divisao(dividendo, divisor);
		}
	}
	
//================================== EXEMPLO 2 =======================================
//====================================================================================
	public int potencia(int base, int expoente) {
		if (expoente == 0) {
			return 1;
		} else {
			return base * potencia(base, expoente - 1);
		}
	}
	
//================================== EXEMPLO 3 =======================================
//====================================================================================
	public int soma(int[] vetor, int tamanho) {
		if (tamanho == 0) {
			return 0;
		} else {
			int ultimaPosicao = tamanho - 1;
			int valor = vetor[ultimaPosicao];
			return valor + soma(vetor, ultimaPosicao);
		}
	}
	

	

//============================= EXERCÍCIO FATORIAL ===================================
//====================================================================================	
	public int RecursividadeFatorial(int num) {
		int fat = 1;
		
		if(num <= 1) {
			return 1;
		}
		else {
			fat = num * RecursividadeFatorial(num - 1);
			return fat;
		}		
	}
	
	

//================================= EXERCÍCIO 1 ======================================
//====================================================================================	
	public double Exerc01Somatorio(double num) {
		double soma = 1;
		
		if(num <= 0) {
			return 0;
		}
		else {
			soma = num + Exerc01Somatorio(num - 1);
			return soma;
		}		
	}
	

//================================= EXERCÍCIO 2 ======================================
//====================================================================================	
	public int binario(int num) {
		if (num == 0) {					
			return 0;
		} else {			
			num = (num % 2) + (10 * binario(num/2));			
			return num;
		}
	}	

	
	
//================================= EXERCÍCIO 3 ======================================
//====================================================================================
	public double Exerc03SomatorioMenor(double num) {
		double res = 1;
		
		if(num <= 0) {
			return 0;
		}
		else {
			res = Exerc03SomatorioMenor(num - 1) + (1 /num);
			return res;
		}		
	}
}






