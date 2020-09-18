package view;


public class Main {

	public static void main(String[] args) {
		ThreadMostrarID t[] = new ThreadMostrarID[5];
		for (int i = 0; i < t.length; i++) {
			t[i]= new ThreadMostrarID(i);
		}
		
		for (int i = 0; i < t.length; i++) {
			t[i].start();
		}
		

	}

}
