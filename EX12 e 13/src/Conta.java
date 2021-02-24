
public class Conta {
        private double saldo;
        private int agencia;
        private int num_conta;
        
        public void setSaldo(double saldo) {  
            this.saldo = saldo; 
        }
        public double getSaldo() {
            return saldo; 
        }
        public void sacar(double valor) { 
            setSaldo(getSaldo() - valor);
        }
        public int getAgencia() {
            return agencia;
        }
        public int getNum_conta(){
            return num_conta;
        }
		public void transferirPara(Conta destino, int valor) {
			setSaldo(getSaldo() - valor);
	        destino.setSaldo(destino.getSaldo() + valor);	
		}
        public void depositar (int deposito) {
            this.saldo = getSaldo() + deposito; 
        }
        public void efetuarPagamento (int pagamento) {
            this.saldo = getSaldo() - pagamento;
        }
        public void colocarCreditosCelular (int cred) {
            this.saldo = getSaldo() - cred;
        }

}
