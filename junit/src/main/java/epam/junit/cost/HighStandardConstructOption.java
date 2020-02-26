package epam.junit.cost;

public class HighStandardConstructOption {
	private double costPerSqaureFeet = 1800;
	public double estimator(double AreaOfHouse) {
		return AreaOfHouse*costPerSqaureFeet;
	}
}