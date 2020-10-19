import java.util.Scanner;

public class orderDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		//菜單
		String [][] menu = new String[3][];
		menu[0] = new String[] {"凱薩沙拉 $50", "和風沙拉 $45"};
		menu[1] = new String[] {"香煎雞腿 $120", "經典牛排 $130", "海陸雙拼 $180"};
		menu[2] = new String[] {"綠茶 $20", "咖啡 $35", "柳橙汁 $15", "可爾必思 $25"};
		
		//價格
		int [][] price = new int [3][];
		price[0] = new int[] {50, 45};
		price[1] = new int[] {120, 130, 180};
		price[2] = new int[] {20, 35, 15, 25};
		
		int bill = 0; //帳單金額
		int choice[] = {0, 0, 0};//紀錄使用者輸入的數字
		int k = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("***請選擇***");
			for(int j = 0; j < menu[i].length; j++) {
				System.out.println(menu[i][j] + " 請輸入-> " + (j + 1));
			}
			//判斷輸入的數字有沒有在菜單內
			do{
				choice[i] = scn.nextInt() - 1;
					
				//輸入的數字在菜單內
				if(choice[i] + 1 <= menu[i].length) {
					k = 0;
					bill += price[i][choice[i]];
				}
				//輸入超過菜單
				else {
					System.out.println("your choice isn't in menu, plz try again.");
					k++;
				}//else
			}while(k > 0);
		}//for_i
		
		System.out.println("**您選擇**");
		System.out.printf("前菜:%s, 主菜:%s, 飲料:%s", menu[0][choice[0]], menu[1][choice[1]], menu[2][choice[2]]);
		System.out.printf("\n應付金額: %d", bill);
		
		scn.close();
	}

}
