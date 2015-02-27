import javax.swing.JFrame;
public class canvas extends JFrame{
		
		//WIDTH & HEIGHT OF FRAME
		static int width = 600;
	 	static int height = 600;
	
	private final ThreadAnimation ta;
	private final PaintSurface ps; 

	public canvas(){
		setTitle("PINGPONG GAME");
		
		setSize(width,height);
		
		ps = new PaintSurface();
		super.add(ps);

		 ta = new ThreadAnimation(this);
		ta.start();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String args[]){
                    new canvas();
	}

}

