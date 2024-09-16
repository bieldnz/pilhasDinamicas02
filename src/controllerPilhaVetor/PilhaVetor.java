package controllerPilhaVetor;

import controller.ControllerPilha;

public class PilhaVetor {
	public void calcNewVet() throws Exception {
		
		String[] pilhaVet = {"J", "G", "R", "B", "H", "L", "W"};
		String[] novaPilha = {"L","B", "M", "G", "K"};
		int tamanho = novaPilha.length;
		ControllerPilha pilha = new ControllerPilha();
		for(String item : pilhaVet) {
			pilha.push(item);
		}
		
		while(!pilha.isEmpty()) {
			pilha.pop();
		}
		for(int x = 0; x < tamanho; x++) {
			pilha.push(novaPilha[x]);
		}
		
	}
}
