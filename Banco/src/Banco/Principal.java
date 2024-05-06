package Banco;

public class Principal extends contaCorrente{

	public static void main(String[] args) {

		contaCorrente cc1 = new contaCorrente();
		
	    cc1.sacar(100);
	    cc1.receberPix(1000);
	    cc1.enviarPix(200);
	    cc1.setNomeCliente("Leonardo Dantas");
	    cc1.setConta("8569");
	    cc1.setAgencia("64");	
	    cc1.setSaldo(0);
	    cc1.receberPix(100);

		
	}

}
