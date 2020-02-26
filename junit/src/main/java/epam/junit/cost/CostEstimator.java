package epam.junit.cost;

public class CostEstimator {
	public double estimatedCostForConstruction(int typeOfConstruction, double AreaOfHouse, boolean Automation) {
		switch(typeOfConstruction){
		case 1:{
			if(!Automation) {
				return (new StandardConstructOption().estimator(AreaOfHouse));
			}
			else {
				return -1;
			}
		}
		case 2:{
			if(!Automation) {
				return (new AboveStandardConstructOption().estimator(AreaOfHouse));
			}
			else {
				return -1;
			}
		}
		case 3:{
			if(!Automation) {
				return (new HighStandardConstructOption().estimator(AreaOfHouse));
			}
			else {
				return (new AutomatedHighStandardConstructOption().estimator(AreaOfHouse));
			}
		}
		}
	return -1;
	}
}

