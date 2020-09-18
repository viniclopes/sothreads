package view;

import controller.ThreadVetor;

public class Main {
	 public static void main(String[] args) {
		 int vetor[] = new int[1000];
		 for (int i = 0; i < vetor.length; i++) {
			vetor[i]=(int)((Math.random()*100)+1);
		}
		 ThreadVetor t0 = new ThreadVetor(0, vetor);
		 ThreadVetor t1 = new ThreadVetor(1, vetor);
		 
		 t0.start();
		 t1.start();
	} 
}
