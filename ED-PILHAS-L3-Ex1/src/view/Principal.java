package view;
import controller.Controller;
public class Principal {
	public static void main (String[]args) {
		
		int[]vet = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		int tamanho = vet.length;
		
		Controller pCont = new Controller();
		
		int size = pCont.Algoritmo(vet, tamanho);
		System.out.println("Quantidade de valores presentes na pilha: " + size);
		
	}

}
