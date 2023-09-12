package Atividade4;

public class Conta2 {
		
		public int agencia;
		public int	conta;
		public String titular;
		public double saldo;
		static int totalConta123 = 1000;
		static int totalConta300 = 5000;
		
		public Conta2(int agencia, String titular) {
			
			this.agencia = agencia;
			this.titular = titular;
			
			
			if (agencia == 123) {
				this.conta = totalConta123 +1;
				totalConta123++;
			}
			if (agencia == 300) {
				this.conta = totalConta300 +1;
				totalConta300++;
			}
			
			
			
			
			System.out.println("----------------------------");
			System.out.println("Voçe acaba de criar uma conta para " + titular);
			System.out.println("Agência: " + agencia);
			System.out.println("Conta: " + conta);
			
		}
}
