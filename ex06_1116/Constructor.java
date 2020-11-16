package constructor;

class Ccar{
	private double gas = 50, tbo = 12;
	private double max_dist;
	
	private void setGas(double g) {
		if(g > 30 && g < 80)
			gas = g;
	}
	
	private void setTbo(double t) {
		if(t > 4 && t < 20)
			tbo = t;
	}
	
	private void maxDist() {
		max_dist = gas * tbo;
	}
	
	//零引數的構式
	public Ccar() {
		maxDist();
	}
	
	//一個引數的構式
	public Ccar(double g) {
		setGas(g);
		maxDist();
	}
	
	//兩個引數的構式
	public Ccar(double g, double t) {
		setGas(g);
		setTbo(t);
		maxDist();
	}
	
	//傳出資料
	public double getDist() {
		return max_dist;
	}
}

public class Constructor {

	public static void main(String[] args) {
		Ccar car1 = new Ccar();
		Ccar car2 = new Ccar(40.5);
		Ccar car3 = new Ccar(64.5, 9.2);
		
		System.out.println("new Ccar() 加滿油可行駛" + car1.getDist() + "km");
		System.out.println("new Ccar(40.5) 加滿油可行駛" + car2.getDist() + "km");
		System.out.println("new Ccar(64.5, 9.2) 加滿油可行駛" + car3.getDist() + "km");

	}

}
