package one.digitalinnovation.test;

import one.digitalinnovation.singleton.*;

public class TestSingleton {

	public static void main(String[] args) {
		
		//Teste singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		SingletonLazy lazy1 = SingletonLazy.getInstancia();
		System.out.println(lazy1);
		
		System.out.println("-------------------------------");
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		SingletonEager eager1 = SingletonEager.getInstancia();
		System.out.println(eager1);
		
		System.out.println("-------------------------------");
		
		SingletonLazyHolder lazyH = SingletonLazyHolder.getInstancia();
		System.out.println(lazyH);
		SingletonLazyHolder lazyH1 = SingletonLazyHolder.getInstancia();
		System.out.println(lazyH1);

	}

}
