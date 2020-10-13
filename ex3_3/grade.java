package ex3_3;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char grade;
		int score;
		
		System.out.print("Enter your score: ");
		score = scn.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
		case 8:
			grade = '甲';
		    break;
		case 7:
		    grade = '乙';
		    break;
		case 6:
			grade = '丙';
		   break;
		default:
			grade = '丁';
		}
		System.out.print(score + " = " + grade + " grade.");
		scn.close();
		
	}

}
