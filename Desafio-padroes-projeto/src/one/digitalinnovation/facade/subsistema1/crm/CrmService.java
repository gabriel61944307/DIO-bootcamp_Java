package one.digitalinnovation.facade.subsistema1.crm;

public class CrmService {
	
	private CrmService() {}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM.");
		System.out.println("Nome: " + nome + " - cep: " + cep + " - cidade: " + cidade + " - estado: " + estado);
	}
}
