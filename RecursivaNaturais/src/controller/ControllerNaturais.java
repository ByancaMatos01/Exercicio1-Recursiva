package controller;

public class ControllerNaturais {
	public static int somatorioNaturais(int n) {
	    if (n < 0) {
	      return 0; // condição de parada: retorna zero para números negativos
	    }
	    else if (n == 0) {
	      return 0; // condição de parada: retorna zero para zero
	    }
	    else {
	      return n + somatorioNaturais(n-1); // relação de chamada: chama a função recursivamente com n-1
	    }
	  }
}