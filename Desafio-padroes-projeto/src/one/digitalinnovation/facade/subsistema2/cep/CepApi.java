package one.digitalinnovation.facade.subsistema2.cep;

public class CepApi {
	private static CepApi instancia = new CepApi();
	
	private CepApi() {}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Salto";
	}
	public String recuperarEstado(String cep) {
		return "São Paulo";
	}
}
