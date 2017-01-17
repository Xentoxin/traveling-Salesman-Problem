import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Painter extends JFrame {
	public Painter() {
		setTitle("Traveling Salesman Problem");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g , ArrayList<ArrayList<City>> k ) {
		for (int i = 0; i < k.toArray().length; i++) {
			ArrayList<City> r = k.get(i);
			for (int x = 1; x < r.toArray().length; x++) {
				City a = r.get(x);
				City b = r.get(x - 1);
				g.setColor(Color.BLACK);
				g.drawLine(a.getX(), a.getY(), b.getX(), b.getY());
			}

		}
	}
}
