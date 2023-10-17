package ControleFluxo;

public class ParametrosInvalidosException extends Exception {
	
	ParametrosInvalidosException(){
		super("Erro: o parâmetro dois precisa ser maior que o parâmetro um");
	}
}
