package epam.junit.cost;

public class AutomatedHighStandardConstructOption {
	private double costPerSqaureFeet = 2500;
	public double estimator(double AreaOfHouse) {
		return AreaOfHouse*costPerSqaureFeet;
	}
}