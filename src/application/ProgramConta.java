package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBanco contaBanco;
		
		System.out.print("Entre com o número da conta: ");
		int number = sc.nextInt();
		System.out.print("Entre com o titular da conta: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Deseja fazer depósito inicial (S/N)?");
        char resposta = sc.next().charAt(0);
        if (resposta == 'S') {
        	System.out.println("Entre com o valor a ser depositado: ");
        	double depositoInicial = sc.nextDouble();
        	contaBanco = new ContaBanco(number, name, depositoInicial);
        }
        else {
        	contaBanco = new ContaBanco(number, name);
        }
        
        System.out.println();
        System.out.println("");
        System.out.println(contaBanco);
        
        System.out.println();
        System.out.print("Qual o valor a ser depositado?");
        double valorDeposito = sc.nextDouble();
        contaBanco.deposito(valorDeposito);
        System.out.println("Dados atualizados da conta :");
        System.out.println(contaBanco);
        

        System.out.println();
        System.out.print("Qual o valor do saque?");
        double valorSaque = sc.nextDouble();
        contaBanco.saque(valorSaque);
        System.out.println("Dados atualizados da conta :");
        System.out.println(contaBanco);
        
        sc.close();
	}

}
