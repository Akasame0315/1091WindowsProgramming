package ex3_3;

import java.util.Scanner;

public class elseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int using;//用水量
		double bill = 0;//帳單
		
		System.out.println("enter how much water you use: ");
		using = scn.nextInt();
		
		if(using >= 1 && using <= 10) {
			System.out.println("$7.35 per du.");
			bill = 7.35 * using;
		}
		else if(using >= 11 && using <=30 ) {
			System.out.println("$9.45 per du.");
			bill = 9.45 * using;
		}
		else if(using >= 31 && using <= 50) {
			System.out.println("$11.55 per du.");
			bill = 11.55 * using;
		}
		else if(using >= 50) {
			System.out.println("$12.075 per deg.");
			bill = 12.075 * using;
		}
		System.out.printf("your bill is %d.", (int)(bill));
		//bill是double型別,要改成int型別才能用%d輸出
		
		scn.close();
		
	}

}
