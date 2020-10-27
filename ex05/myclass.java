
public class myclass {
	
	//not static method
	void add(int x, int y) {
		System.out.print("call not static myclass' method: ");
		System.out.println(x + " + " + y + " = " + (x+y));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 25;
		
		//creat myclass class object c1
		myclass c1 = new myclass();
		//call c1
		c1.add(a-2, 7);
		
		//creat mycal class object c2
		mycal c2 = new mycal();
		//call c2
		c2.sub(a, 8);
	}
	
}

class mycal{
	void sub(int x, int y) {
		System.out.print("call not static mycal's method: ");
		System.out.println(x + " - " + y + " = " + (x-y));
		
		
	}
}
