package controller;

public class ControllerNaturais {
	public static int somatorioNaturais(int n) {
	    if (n < 0) {
	      return 0; // condi��o de parada: retorna zero para n�meros negativos
	    }
	    else if (n == 0) {
	      return 0; // condi��o de parada: retorna zero para zero
	    }
	    else {
	      return n + somatorioNaturais(n-1); // rela��o de chamada: chama a fun��o recursivamente com n-1
	    }
	  }
}