package br.univel.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.univel.common.Tarefa;

class CalculoDemorado 
		implements Tarefa<Integer, List<Integer>>,
		Serializable {

	@Override
	public List<Integer> executar(Integer p) {
		List<Integer> retorno = new ArrayList<>();
		try {
			for(int i=1; i<=p; i++){
				Thread.sleep(1000);
	            retorno.add(fibonacciRecusion(i));
	        }
			System.out.println(retorno);
			return retorno;
			
		} catch (Exception e) {
			System.out.println(e);
			
			return retorno;
		}
		
	}
	 public static int fibonacciRecusion(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	 
	        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
	    }

}
