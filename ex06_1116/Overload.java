package overload;

class Cavg{
	public double getAvg(int num1, int num2) {
		return (num1 + num2) / 2;
	}
	
	public double getAvg(int[] vArray) {
		int n = vArray[0];
		for(int i = 1; i < vArray.length; i++) 
			n += vArray[i];
		
		return (double)n / vArray.length;
	}
}

public class Overload {

	public static void main(String[] args) {
		Cavg num = new Cavg();
		int n1 = 20, n2 = 30;
		
		System.out.println(n1 + "和" + n2 + "的平均值: " + num.getAvg(n1, n2));
		
		int[] ary = {12, 23, 31, 45, 56};
		
		System.out.println("array{12, 23, 31, 45, 56}的平均值: " + num.getAvg(ary));

	}

}
