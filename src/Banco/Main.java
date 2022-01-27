package Banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente Marcio = new Cliente();
		Marcio.setNome("Marcio");
		
		Conta cc = new ContaCorrente(Marcio);
		cc.depositar(2550);
		
		Conta cp = new ContaPoupanca(Marcio);
		
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
