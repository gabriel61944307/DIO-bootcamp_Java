package one.digitalinnovation.test;

import one.digitalinnovation.strategy.*;

public class TestStrategy {

	public static void main(String[] args) {
		// Teste strategy
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento ofensivo = new ComportamentoOfensivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(ofensivo);
		robo.mover();

	}

}
