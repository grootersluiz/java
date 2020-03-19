package banksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String aux, aux1;
		int opcao;
		double valor;
		int numero;
		int numero1;
		ArrayList<Conta> lc = new ArrayList();
		Conta c1;
		
		do {
			System.out.println("--- MENU ---");
			System.out.println("1) Criar Conta");
			System.out.println("2) Depósito");
			System.out.println("3) Saque");
			System.out.println("4) Transferência");
			System.out.println("5) Saldo");
			System.out.println("6) Dados da Conta");
			System.out.println("0) Sair");
			
			System.out.print("Opção: ");
			opcao = in.nextInt();
			in.nextLine();
			
			switch(opcao) {
			
			case 1:
				System.out.print("Digite o nome do titular: ");
				aux = in.nextLine();
				System.out.print("Digite o CPF/CNPJ do titular: ");
				aux1 = in.nextLine();				
				
				c1 = new Conta(aux, aux1);
				lc.add(c1);
				
				break;
				
			case 2: 
				System.out.print("Digite o número da conta: ");
				numero = in.nextInt();
				
				c1= lc.get(numero-1);
				System.out.print("Digite o valor do depósito: ");
				valor = in.nextDouble();
				c1.Deposito(valor);
				
				break;
			
			case 3:
				System.out.print("Digite o número da conta: ");
				numero = in.nextInt();
				
				c1 = lc.get(numero-1);				
				
				System.out.print("Digite o valor do saque: ");
				valor = in.nextDouble();
				c1.Saque(valor);
				
				break;				
			
			case 4: 
				System.out.print("Digite o número da conta debitada: ");
				numero = in.nextInt();
			    c1 = lc.get(numero-1);				
				
				System.out.print("Digite o valor da tranferência: ");
				valor = in.nextDouble();
				c1.TransferenciaDebito(valor);
				System.out.print("Digite o número da conta creditada: ");
				numero = in.nextInt();
			    c1 = lc.get(numero-1);
			    c1.TransferenciaCredito(valor); 
				
				break;
			
			case 5:
				System.out.print("Digite o número da conta: ");
				numero = in.nextInt();

				c1 = lc.get(numero-1);                
				
				c1.Saldo();
				
				break;
				
			case 6:
				System.out.print("Digite o número da conta: ");
				numero = in.nextInt();
				
				c1 = lc.get(numero-1);
				
				c1.DadosBancarios();
				
				break;
				
			default:
				if(opcao != 0) 
					System.out.println("Opção Inválida");
					
				break;
			}
			
		}while(opcao != 0);
	}

}
