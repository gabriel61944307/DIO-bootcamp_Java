package one.digitalinnovation.test;

import one.digitalinnovation.facade.implementacao.Facade;

public class TestFacade {

	public static void main(String[] args) {
		// Teste facade
		Facade facade = new Facade();
		facade.migrarCliente("Gabriel", "123456-78");
	}

}
