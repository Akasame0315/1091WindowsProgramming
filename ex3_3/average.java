import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0, sum = 0, num = 0;
							//人數
		//double average;
		
		Scanner scn = new Scanner(System.in);
		
		
		while(score != -1){
			System.out.print("Enter a score(enter -1 to exit): ");
			score = scn.nextInt();
			sum += score;
			num ++;
			
			
		}
		
		//average = (sum+1)/(num-1);
		
		System.out.printf("The average: %d", (int)((sum+1)/(num-1)));
		//sum+1因為最後輸入-1也會+進sum, num-1因為輸入-1也會num++
		
		scn.close();
		
	}

}
