package br.univel.common;

import java.util.List;

public interface Tarefa<P, R> {
	
	
	public R executar(P p);

}


