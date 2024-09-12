package controller;
import maryanalib.pilhaint.*;
public class Controller {
	
	public Controller() {
		super();
	}
	
	Pilha p = new Pilha();
	
	public int Algoritmo(int[]vet, int tamanho) {
		for (int i=0; i<tamanho; i++) {
			if (vet[i]>= 0) {
				p.push(vet[i]);
				
			} else {
				int soma = p.pop() + p.pop();
				p.push(vet[i]);
				p.push(soma);
				
			}	
		}
		int size = p.size();
		return size;
		
	}
	

}
