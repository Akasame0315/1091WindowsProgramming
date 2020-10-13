package ex3_3;

import java.util.Scanner;

public class nestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("plz enter 3 numbers(use space between them): ");
		//輸出3個數
		
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3)
				System.out.printf("The max number is: %d", num1);
				//num1最大
			else
				System.out.printf("The max number is: %d", num3);
				//num3最大
		}
		else {
			if(num2 > num3)
				System.out.printf("The max number is: %d", num2);
				//num2最大
			else
				System.out.printf("The max number is: %d", num3);
				//num3最大
		}
			
		scn.close();
		
	}

}
