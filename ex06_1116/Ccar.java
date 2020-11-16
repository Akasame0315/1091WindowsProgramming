package ex06_1116;

public class Ccar {
	public double gas, tbo;
	public double max_dist;
	
	public void maxDist() {
		max_dist = gas * tbo;
	}
	
	public double dist(double oil) {
		return oil * tbo;
	}
}
