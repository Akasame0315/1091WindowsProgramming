package encapsulate;

class Ccar{
	private double gas, tbo;
	private double max_dist;
	
	private void maxDist() {
		max_dist = gas * tbo;
	}
	
	public void setValue(double g, double t) {
		gas = g;
		tbo = t;
		maxDist();
	}
	
	public double getDist() {
		return max_dist;
	}
}

public class Encapsulate {

	public static void main(String[] args) {
		
		Ccar car1 = new Ccar();
		Ccar car2 = new Ccar();
		
		double g1 = 40, t1 = 13.6;
		car1.setValue(g1, t1);
		
		double distance1 = car1.getDist();
		
		System.out.println("car1加滿油可行駛: " + distance1 + " km");
		car2.setValue(60, 9.5);
		System.out.println("car2加滿油可行駛: " + car2.getDist() + " km");
		

	}

}
