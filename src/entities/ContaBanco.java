package entities;

public class ContaBanco {
	
	private int conta;
	private String nome; 
	private double saldo;

	public ContaBanco(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public ContaBanco(int conta, String nome, double depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito (double quantidade) {
		saldo += quantidade;
	}

    public void saque (double quantidade) {
    	saldo -= quantidade + 5.0;
    }

    public String toString() {
        return "Conta : "
              + conta 
              + " Titular : "
              + " Saldo : $ "
              + String.format("%.2f", saldo);
    }
    
}
