package epam.junit.cost;

public class AboveStandardConstructOption {
	private double costPerSqaureFeet = 1500;
	public double estimator(double AreaOfHouse) {
		return AreaOfHouse*costPerSqaureFeet;
	}
}