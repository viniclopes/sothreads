package controller;

public class CalculaLinhaThread extends Thread{
	private int linha;
	private int soma;
	
	private static int[][] matriz;
	
	public CalculaLinhaThread(int linha) {
		this.linha=linha;
		this.soma=0;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < matriz[linha].length; i++) {
			soma+=matriz[linha][i];
		}
		showSoma();
	}
	
	private void showSoma() {
		System.out.println("Linha : "+this.linha+" Soma : "+this.soma);
	}

	public static void setMatriz(int m[][]) {
		matriz = m;
	}
	
}
