import java.awt.Image;
import javax.swing.ImageIcon;

public class Tile {
	private int x_coordinate;
	private int y_coordinate;
	private boolean visibility = false;
	private Image image;
	
	public Tile(int x, int y) {
		x_coordinate = x;
		y_coordinate = y;
		loadImage("images/hiddenTile.png");
	}
	
	public int getX() {
		return x_coordinate;
	}
	
	public int getY() {
		return y_coordinate;
	}
	
	public boolean getVis() {
		return visibility;
	}

	public void loadImage(String img) {
		image = new ImageIcon(img).getImage();
	}
	
	public void uncoverTile(String tileImg) {
		visibility = true;
		loadImage(tileImg);
	}

	protected void changeX(int dx) {
		x_coordinate =+ dx;
	}
	
	protected void changeY(int dy) {
		y_coordinate =+ dy;
	}
}
