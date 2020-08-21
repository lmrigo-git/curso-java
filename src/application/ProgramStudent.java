package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Student student = new Student();

        System.out.println("Nome do aluno: ");
		student.name = sc.nextLine();
		System.out.println("Nota A: ");
		student.notaA = sc.nextDouble();
		System.out.println("Nota B: ");
        student.notaB = sc.nextDouble();
        System.out.println("Nota C: ");
        student.notaC = sc.nextDouble();

        System.out.println("Aluno: " + student.name + " " + student.notaFinal());

        if (student.mediaFinal() >= 7) {
        	System.out.println("Média: " + student.mediaFinal() + " APROVADO");
        }
    	else {        		
    		System.out.println("Média: " + student.mediaFinal() + " REPROVADO");
    	}
        sc.close();
	}

}
