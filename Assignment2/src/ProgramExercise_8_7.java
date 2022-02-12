import java.util.Scanner;

public class ProgramExercise_8_7 {

	static double points[][] = new double[8][3];

	public static void main(String[] args) {
		int closeValue[] = new int[2];
		int c1, c2;

		System.out.println("Enter 8 points each has x, y, and z");
		inputArray();

		closeValue = closestPoints(points);

		c1 = closeValue[0];
		c2 = closeValue[1];

		displayClosestPoints(c1, c2);

	}

	public static void inputArray() {
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 3; j++) {
				points[i][j] = input.nextDouble();
			}
		}
	}

	public static int[] closestPoints(double[][] input) {
		double dist = 0.0;
		int[] close = new int[2];

		double shortest = distance(input[0][0], input[0][1], input[0][2], input[1][0], input[1][1], input[1][2]);

		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				dist = distance(input[i][0], input[i][1], input[i][2], input[j][0], input[j][1], input[j][2]);

				if (shortest > dist) {
					close[0] = i; // Update p1
					close[1] = j; // Update p2
					shortest = dist;
				}
			}
		}

		return close;
	}

	public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
	}

	public static void displayClosestPoints(int x, int y) {
		System.out.println("The closest points are {" + points[x][0] + ", " + points[x][1] + ", " + points[x][2]
				+ "} and {" + points[y][0] + ", " + points[y][1] + ", " + points[y][2] + "}");
	}
}