package br.univel.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.univel.common.ExecutorRMI;

public class ClientExecutor {

	protected ExecutorRMI servico;

	public ClientExecutor() {

		Registry registry;
		try {
			registry = LocateRegistry
					.getRegistry("127.0.0.1", 1818);
			servico = (ExecutorRMI) registry
					.lookup(ExecutorRMI.NOME);
			
			Integer res = servico.executar(new CalculoDemorado(), 3);
			
			System.out.println("Resposta: " + res);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new ClientExecutor();
	}
}
