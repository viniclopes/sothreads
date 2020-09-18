package view;

public class ThreadMostrarID extends Thread{
	private int id;
	
	public ThreadMostrarID(int id) {
		this.id=id;
	}
	
	@Override
	public void run() {
		ShowId();
	}
	
	private void ShowId() {
		System.out.println(id);
	}
	
	
}
