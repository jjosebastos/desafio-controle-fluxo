package ControleFluxo;

import java.util.Scanner;

public class Contador {
	 public static void main(String[] args) {
		
		 Scanner terminal = new Scanner(System.in);
		 
		 System.out.println("Digite o primeiro parâmetro: ");
		 int parametroUm = terminal.nextInt();
		 
		 System.out.println("Digite o segundo parâmetro: ");
		 int parametroDois = terminal.nextInt();
		 
		 try {
			 contar(parametroUm, parametroDois);
			 
		 } catch (ParametrosInvalidosException e)  {
			 System.err.println("Erro: o parâmetro dois precisa ser maior que o parâmetro um");			 
		 }
		
	} 
	
	 static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		 	
		 	int contagem = parametroDois - parametroUm;
		 	
		 	if (parametroDois < parametroUm) {
		 		throw new ParametrosInvalidosException();
		 	} else {
		 		for  (int indice = 1; indice <= contagem; indice++ ) {
			 		System.out.println("Imprimindo o número " + indice);
			 	} 
		 	}
		 	
		 	
	 }
	
}
