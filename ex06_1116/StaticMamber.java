package staticMember;

class Ccar{
	private static int car_num;
	private double gas = 50, tbo = 12;
	
	private void setGas(double g) {
		if(g > 30 && g < 80)
			gas = g;
	}
	
	private void setTbo(double t) {
		if(t > 4 && t < 20)
			tbo = t;
	}
	
	public Ccar() {
		car_num++;
	}
	
	public Ccar(double g) {
		setGas(g);
		car_num++;
	}
		
	public Ccar(double g, double t) {
		setGas(g);
		setTbo(t);
		car_num++;
	}
	
	public static void getObjectNum() {
		System.out.println("第" + car_num + "部車");
	}
	
	public void showValue() {
		System.out.println("最大載油量: " + gas + "L, 平均耗油量: " + tbo + "L");
	}
	
}

public class StaticMamber {

	public static void main(String[] args) {
		
		Ccar car1 = new Ccar();
		Ccar.getObjectNum();
		car1.showValue();
		
		Ccar car2 = new Ccar(40.5);
		Ccar.getObjectNum();
		car2.showValue();
		
		Ccar car3 = new Ccar(64.5, 9.2);
		Ccar.getObjectNum();
		car3.showValue();

	}

}
