package controller;

public class ThreadVetor  extends Thread{
	private int v[];
	private long tIni;
	private long tFim;
	private int tipo;
	
	public ThreadVetor(int tipo, int [] vetor) {
			this.v=vetor;
			this.tIni=System.nanoTime();
			this.tipo=tipo;
	}
	
	@Override
	public void run() {
		String tipoFor;
		if((tipo % 2) == 0) {
			this.byFor();
			tipoFor="For";
		}else {
			this.byForEach();
			tipoFor="ForEach";
		}
		System.out.println("Tipo de For : "+tipoFor+" Tempo levado : "+((tFim-tIni))+" Nano Segundos");
	}

	private void byForEach() {
		for (int i : v) {
			
		}
		this.tFim=System.nanoTime();	
	}

	private void byFor() {
		for (int i = 0; i < v.length; i++) {
			
		}
		this.tFim=System.nanoTime();
	}

}
