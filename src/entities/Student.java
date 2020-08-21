package entities;

public class Student {

	public String name;
	public double notaA;
	public double notaB;
	public double notaC;
	
	public double notaFinal () {
		return notaA + notaB + notaC;
	}

	public double mediaFinal () {
		return (notaA + notaB + notaC) / 3;
	}

}
