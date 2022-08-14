
public class Main {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("joao");
		
		Conta cc = new ContaCorrente(joao);
		Conta poupanca = new ContaPoupanca(joao);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.depositar(100);
		poupanca.depositar(50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.transferir(50, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
