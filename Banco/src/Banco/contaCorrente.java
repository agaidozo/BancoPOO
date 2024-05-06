package Banco;

public class contaCorrente {

	
	    private String nomeCliente;
	    double saldo;
	    private String conta;
	    private String agencia;
		

	   void Conta(String nomeCliente, double saldo, String conta, String agencia ) {
	        this.nomeCliente = nomeCliente;
	        this.saldo = saldo;
	        this.conta = conta;
	        this.agencia = agencia;
	       
	    }
	   public contaCorrente () {
		   System.out.println("Crie uma nova conta:");
	   }

	    public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		System.out.println("nome do cliente:" + nomeCliente);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
		System.out.println("Saldo atual:" + saldo);
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
		System.out.println("nemero da conta:" + conta);
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
		System.out.println("numero da agencia:" + agencia);
	}
	
	
	
	void receberPix(double valor) {
	        saldo += valor;
	        System.out.println("pix recebido de R$" + valor + " realizado. Novo saldo: R$" + saldo);
	    }

	void sacar(double valor) {
	        if (saldo >= valor) {
	            saldo -= valor;
	            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
	        } else {
	            System.out.println("Saldo insuficiente para saque de R$" + valor);
	        }
	    }

	 void enviarPix( double valor) {
	   
			if (saldo >= valor) {
	            saldo -= valor;
	           
	            System.out.println("PIX de R$" + valor + " enviado ");
	        } else {
	            System.out.println("Saldo insuficiente para enviar PIX de R$" + valor);
	        }
	    }
	
	
}
