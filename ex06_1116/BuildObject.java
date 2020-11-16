package ex06_1116;

public class BuildObject {

	public static void main(String[] args) {
		Ccar car1 = new Ccar();
		car1.gas = 40;
		car1.tbo = 13.6;
		car1.maxDist();
		
		double distance1 = car1.dist(20);
		
		System.out.println("car1:");
		System.out.println("最大載油量: " + car1.gas + "L");
		System.out.println("平均耗油量: " + car1.tbo + "km/L");
		System.out.println("加滿油可行駛: " + car1.max_dist + "km");
		System.out.println("加油20L可行駛: " + distance1 + "km");
		System.out.println();
		
		Ccar car2 = new Ccar();
		car2.gas = 60;
		car2.tbo = 9.5;
		car2.maxDist();
		
		System.out.println("car2:");
		System.out.println("最大載油量: " + car2.gas + "L");
		System.out.println("平均耗油量: " + car2.tbo + "km/L");
		System.out.println("加滿油可行駛: " + car2.max_dist + "km");
		System.out.println("加油20L可行駛: " + car2.dist(20) + "km");

	}

}
