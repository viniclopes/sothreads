package view;

import controller.CalculaLinhaThread;

public class Main {

	public static void main(String[] args) {
		int M[][] = new int [3][5];
		CalculaLinhaThread ct[]  = new CalculaLinhaThread[M.length];
		
		for (int i = 0; i < M.length; i++) {
			ct[i]= new CalculaLinhaThread(i);
			for (int j = 0; j < M[0].length; j++) {
				M[i][j] = (int)(Math.random()*100);
			}
		}
		
		ct[0].setMatriz(M);
		
		for (int i = 0; i < ct.length; i++) {
			ct[i].start();
		}

	}

}
