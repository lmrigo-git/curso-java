package application;

public class ProgramEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vect = new String[] {"Maria", "José", "João"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println(" ---------------- ");

		for (String teste : vect) {
			System.out.println(teste);
		}

	}

}
