import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
//import java.util.ArrayList;
import javax.swing.JFrame;

public class Tester extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ArrayList<City> lols = new ArrayList<City>();

	public Tester() {
		setTitle("Traveling Salesman Problem");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Random rand = new Random();
		new Tester();
		City NY = new City("New York", rand.nextInt(500), rand.nextInt(500)+100);
		City CA = new City("Cali", rand.nextInt(400),rand.nextInt(400)+100);
		City AK = new City("Alaska", rand.nextInt(500), rand.nextInt(500)+100);
		City ID = new City("Idaho" , rand.nextInt(400), rand.nextInt(400)+100);
		ArrayList<City> List = new ArrayList<City>();
		List.add(NY);
		List.add(CA);
		List.add(AK);
		List.add(ID);
		BruteForce brute = new BruteForce();
		System.out.println("Number of Permutations : " + brute.factorial(List.toArray().length - 1));
		System.out.println("Permutations");
		for (int i = 0; i < brute.factorial(List.toArray().length - 1); i++) {
			System.out.println(brute.PermSolver(List, i));
		}
		System.out.println("Shortest Route: " + brute.Solution(List));
		System.out.println("Shortest Route Distance :" + brute.DistSolver(brute.PermSolver(List, 0)));
		lols = brute.Solution(List).get(0);
}
	public void paint(Graphics g){
		for (int x = 0; x < lols.toArray().length-1; x++) {
			City a = lols.get(x);
			City b = lols.get(x +1);
			g.setColor(Color.BLACK);
			g.drawLine(a.getX(), a.getY(), b.getX(), b.getY());

	}
	}
}