import org.junit.Assert;
import org.junit.Test;

public class ProgramExercise_8_7Test {
	ProgramExercise_8_7 program = new ProgramExercise_8_7();
	private double[][] expect = { { 0, 0, 0 }, { -1, -1, -1 }, { 0.5, 0.5, 0.5 }, { 2, 0.5, 9 }, { 3.5, 2, -1 },
			{ 3, 1.5, 3 }, { -1.5, 4, 2 }, { 5.5, 4, -0.5 } };
	private int[] expectClose = { 0, 2 };
	private double expectDistance = Math.sqrt(0.75);
	private int expectc1 = 0, expectc2 = 2;

	@Test
	public void testClosestPoints() {
		Assert.assertArrayEquals(expectClose, program.closestPoints(expect));
	}

	@Test
	public void testDistance() {
		Assert.assertEquals(expectDistance, program.distance(expect[expectc1][0], expect[expectc1][1],
				expect[expectc1][2], expect[expectc2][0], expect[expectc2][1], expect[expectc2][2]), 0.0);
	}

}
