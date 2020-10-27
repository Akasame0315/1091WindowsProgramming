
public class static1 {
	//method1
	static void add(int x, int y) {
		System.out.print("call static1 method: ");
		System.out.println(x + " + " + y + " = " + (x+y));
	}
		
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		int a = 25;
		
		//直接呼叫method1
		add(a-5, 3);
		
		//呼叫static2's method
		static2.sub(a, 4);
		
	}
}

//method2
class static2{
	static void sub(int x, int y) {
		System.out.print("call static2 method: ");
		System.out.println(x + " - " + y + " = " + (x-y));
	}
}
