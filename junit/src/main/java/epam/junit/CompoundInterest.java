package epam.junit;

public class CompoundInterest {
	public double CompoundInterestCalculator(double principle, int compoundedPerUnit, double time, double rate) {
		return (principle * Math.pow(1 + (rate / compoundedPerUnit), compoundedPerUnit * time)) - principle;
	}
}