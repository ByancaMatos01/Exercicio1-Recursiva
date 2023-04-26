package view;

import java.util.Scanner;

import controller.ControllerNaturais;

public class Principal {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		ControllerNaturais controllerNaturais = new ControllerNaturais();
	    int n;
	    System.out.println("digite um número: ");
	    n=leia.nextInt();
	    int resultado = ControllerNaturais.somatorioNaturais(n);
	    System.out.println("O somatório dos " + n + " primeiros números naturais é " + resultado);
	  }

	}

