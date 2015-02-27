
import java.awt.geom.Ellipse2D;
class Ball extends Ellipse2D.Float{
	public int x_speed, y_speed;
	private final int d;

	public Ball(int diameter)
	{	
		//RANDOM LOCATION OF NEW BALL
		super( (int)(Math.random() * (canvas.width - 20) + 1),0, diameter, diameter );
		this.d = diameter;
		
		this.x_speed = (int)(Math.random() * 5 + 5);
		this.y_speed = (int)(Math.random() * 5 + 5);
	}
	
	public void move()
	{	
		//TO STRIKE BACK FROM THE CORNERS
		if (super.x < 0 || super.x > canvas.width - d)
			x_speed = -x_speed;
		if (super.y < 0 || super.y > canvas.height - d)

				y_speed = -y_speed;
		
		super.x += x_speed;
		super.y += y_speed;
	}
}