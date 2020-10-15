import java.util.Scanner;

public class menuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String choice;
		int num;
		
		//輸出選單
		System.out.println("**********menu**********");
		System.out.println("\tA.Square");
		System.out.println("\tB.Cubed");
		System.out.println("\tC.exit system");
		System.out.println("************************");
		
		//輸入的字母不是C就重複執行
		do {
			//選平方或三次方
			System.out.print("plz choose function: ");
			choice = scn.next();
			
			switch(choice) {
			//平方
			case "A":
				System.out.print("plz enter a number: ");
				num = scn.nextInt();
				System.out.printf("%d's square is %d.\n", num, (num * num));
				break;
			
			//三次方
			case "B":
				System.out.print("plz enter a number: ");
				num = scn.nextInt();
				System.out.printf("%d's cubed is %d.\n", num, (num * num * num));
				break;
					
			default:
				//輸入沒有的字母就提示重新輸入
				//輸入為C則直接跳出
				if(!(choice.equals("C")))
					System.out.print("We don't have this choice, plz enter again.\n");
				break;	
			}
			
		}while(!(choice.equals("C")));
		
		System.out.print("Exit System.");
		
		scn.close();
	}
}
