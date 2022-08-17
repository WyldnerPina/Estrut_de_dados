package Controller;

public class Testes {
	public Testes() {
		super();
	}
	
	//================================= EXERCÍCIO 2 ======================================
	//====================================================================================
	//public int Exerc02Binario01(int num) {
//		int bin = 0;
//		String result;
	//	
//		if(num == 1) {
//			result = Integer.toString(1);
//			System.out.print(result);
//			return 1;
//		}
//		else if(num == 0){			
//			result = Integer.toString(0);
//			System.out.print(result);
//			return 0;
//		}
//		else {
//			bin = Exerc02Binario01(num / 2);
//			result = Integer.toString(num % 2);
//			System.out.print(result);
//			return bin;
//		}		
	//}


	//
	//================================= EXERCÍCIO 2 ======================================
	//====================================================================================
	//public int Exerc02Binario02(int num, int bin[], int tam, int cont) {
//		if (num < 2) {			
//			bin [tam -1] = num;
//			tam--;
//			System.out.print("....... " + bin [tam - cont]);
//			tam--;
//			return num;
//		} else {
//			cont ++;
//			num = (num % 2) + (2 * Exerc02Binario02(num/2, bin, tam, cont));
//			bin [tam - cont] = num % 2;
//			System.out.print(bin [tam - cont]);
//			return num;
//		}
	//}
	//



	//================================= EXERCÍCIO 2 ======================================
	//====================================================================================
	//public int Exerc02Binario03(int num, int c, int tam) {
//		double result;
	//
//		if (num < 2) {
//			c++;
//			System.out.print(num);			
//			return num;
//		} else {
//			c++;
//			num = (num % 2) + (2 * Exerc02Binario03(num/2, c, tam));
//			result = num % 2;
//			System.out.print(result);
//			return num;
//		}
	//}
		





	//public int [] Veto(int n, int v [], int taman) {
//		for(int j = 0; j < taman; j++) {
//			if(n>0) {
//				v[j] = Resto(n, 2);
//				System.out.print(v[j]);
//				n = n - 2;
//			}else {
//				v[j] = 0;
//				System.out.print(v[j]);
//			}
//		}
//		System.out.println("\n========================================");
//		return v;
	//}
	//
	//	
	//
	//public int Resto(int n, int x) {
//		int r;
//		if(n < x) {
//			r = n;
//			return r;
//		}else {
//			r = Resto(x, n - x);
//			return r;
//		}
	//	
	//}
	
	
}
