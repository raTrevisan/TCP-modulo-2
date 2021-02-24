public class TesteConta {
	
	public static void main(String[] args) {
		Conta c = new Conta();
		c.setSaldo(100); 
		Conta c2 = new Conta();
		c2.setSaldo(200);       
		c.transferirPara(c2, 50);

		System.out.println("Saldo origem: " + c.getSaldo());
		System.out.println("Saldo destino: " + c2.getSaldo()); 
		
		c2.depositar(125);
		System.out.println("saldo pos deposito " + c2.getSaldo());
		
		c2.efetuarPagamento(220);
		System.out.println("saldo pos pagamento " + c2.getSaldo());
		
		c2.colocarCreditosCelular(70);
		System.out.println("saldo pos colocar creditos " + c2.getSaldo() );		
	}
}
