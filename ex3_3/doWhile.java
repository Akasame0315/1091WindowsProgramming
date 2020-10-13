import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int base, result = 1;
		
		do {
			//輸入階乘
			System.out.print("Enter a base number(between 1 and 15): ");
			base = scn.nextInt();
		}while(base < 1 || base > 15);
		//輸入的數不在1跟15之間就跳回迴圈
		
		for(int i = base; i > 0; i--) {
			result *= i;
		}
		System.out.printf("%d! = %d", base, result);
		
		scn.close();
	}

}
