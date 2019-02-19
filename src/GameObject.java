import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {

	int x;
	int y;
	int width;
	int height;
	Rectangle collisionBox;
	
	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		collisionBox = new Rectangle(x, y, width, height);
	}
	
	public void update() {
		collisionBox = new Rectangle(x, y, width, height);
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawRect(collisionBox.x, collisionBox.y, width, height);
	}
}
