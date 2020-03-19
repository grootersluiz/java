package banksystem;

public class Conta {
	private int numero;
	private String titular;
	private String register;
	private double saldo;
	static int qtdcontas = 0;
	
	public Conta(String pTitular, String pRegister) {
		this.titular = pTitular;
		this.register = pRegister;
		qtdcontas++;
		this.numero = qtdcontas;
		this.saldo = 0;
	}
	
	public void Deposito(double pValor) {
		System.out.println("");
		System.out.println("--- Realizando Depósito ---");
		System.out.println("- Saldo Anterior: "+ this.saldo);
		
		this.saldo += pValor;
		
		System.out.println("- Saldo Posterior: "+ this.saldo);
		System.out.println("--- Fim do Depósito---");
		System.out.println("");
	}
	
	public void Saque(double pValor) {
		System.out.println("");
		System.out.println("--- Realizando Saque ---");
		System.out.println("- Saldo Anterior: "+ this.saldo);
		
		if(pValor <= this.saldo) {
			this.saldo -= pValor;
			System.out.println("- Saldo Posterior: "+ this.saldo);
		}
		else {
			System.out.println("- Saldo Insuficiente");
		}
		System.out.println("--- Fim do Saque ---");
		System.out.println("");
	}
	
	public void TransferenciaDebito(double pValor) {
		System.out.println("");
		System.out.println("--- Realizando Transferência ---");
		System.out.println("- Saldo Anterior: "+ this.saldo);
		
		if(pValor <= this.saldo) {
			this.saldo -= pValor;
			System.out.println("- Saldo Posterior: "+ this.saldo);
		}
		else {
			System.out.println("- Saldo Insuficiente");
		}
		
	}
	public void TransferenciaCredito(double pValor) {
		this.saldo += pValor;
		
		System.out.println("--- Transferência Realizada com Sucesso ---");
		System.out.println("- Saldo Posterior: "+ this.saldo);
		System.out.println("--- Fim da Transferência---");
		System.out.println("");
	}
	
	public void Saldo() {
		System.out.println("");
		System.out.println("--- Verificando Saldo ---");
		System.out.println("Saldo Atual: "+ this.saldo);
		System.out.println("--- Fim da Verificação ---");
		System.out.println("");
	}
	
	public void DadosBancarios() {
		System.out.println("");
		System.out.println("--- Dados da Conta ---");
		System.out.println("Nome do Titular: "+ this.titular);
		System.out.println("CPF/CNPJ do Titular: "+ this.register);
		System.out.println("Número da Conta: "+ this.numero);
		System.out.println("Saldo: "+ this.saldo);
		System.out.println("--- Operação Finalizada ---");
		System.out.println("");
	}
}
