import javax.swing.JFrame;

public class ThreadAnimation extends Thread  {

	JFrame f;
	ThreadAnimation(JFrame f){
		this.f = f;	
	}

        @Override
	public void run() {

		while(true){
			f.repaint();
			try {
				Thread.sleep(20); //overall speed of animation
			} catch (InterruptedException e) {
			}
		}
	}

}
