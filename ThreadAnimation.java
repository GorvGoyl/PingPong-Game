import javax.swing.JFrame;

public class ThreadAnimation extends Thread  {

	JFrame f;
	ThreadAnimation(JFrame f){
		this.f = f;	
	}

	public void run() {

		while(true){
			f.repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
