import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileReader;

//import java.util.ArrayList;
import javax.swing.JFrame;

public class Tester2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ArrayList<City> lols = new ArrayList<City>();

	public Tester2() {
		setTitle("Traveling Salesman Problem");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Tester2();
		ArrayList<City> List = new ArrayList<City>();
		Input(args[0], List);
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

	public void paint(Graphics g) {
		for (int x = 0; x < lols.toArray().length - 1; x++) {
			City a = lols.get(x);
			City b = lols.get(x + 1);
			g.setColor(Color.BLACK);
			g.drawLine(a.getX(), a.getY(), b.getX(), b.getY());

		}
	}

	public static void Input(String filename, ArrayList<City> c) {
		try {
			BufferedReader input = new BufferedReader(new FileReader(filename));
			String information;
			while ((information = input.readLine()) != null) {
				information = input.readLine();
				String[] ar = information.split(",");
				for (int i = 0; i < ar.length; i++) {
					City kappa = new City(ar[i], Integer.parseInt(ar[i + 1]), Integer.parseInt(ar[i + 2]));
					c.add(kappa);
				}

			}
			input.close();
		} catch (Exception e) {
			System.out.println("Illegal Arguments");
		}
	}
}