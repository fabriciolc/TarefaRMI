package br.univel.client;

import java.io.Serializable;

import br.univel.common.Tarefa;

class CalculoDemorado2 
		implements Tarefa<Integer, Integer>,
		Serializable {

	@Override
	public Integer executar(Integer p) {
		System.out.println("T Iniciando execu��o.");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print(".");
				Thread.sleep(1_000);
			}
			System.out.println("");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("T Terminando execu��o.");
		return p * 2;
	}

}
