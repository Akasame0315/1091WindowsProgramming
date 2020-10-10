package acc;

import java.util.Scanner;

public class acoountLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        String account, password;//帳號密碼
        int i = 0;//do-while迴圈條件，輸入錯誤一次就跳回輸入帳密，正確就跳出迴圈
        int cash = 0;//消費金額
        double payFor = 0;//結帳金額
        do {
            System.out.print("Enter your account: ");//輸入帳號
            account = scn.nextLine();
            System.out.print("Enter your password: ");//輸入密碼
            password = scn.nextLine();

            if(account.equals("elfin1440") && password.equals("amber0408")){
                System.out.println("Login success，welcome^^");
                i = 0;//如果帳號密碼正確讓while迴圈停止
            }
                
            else {
                System.out.println("Your account or password is wrong, plz try again.");
                i++;//帳號密碼錯誤則讓while迴圈繼續
            }
        }while(i>0);
        
        System.out.println("If you buy more than $2000, you can have 10% discount.");
        System.out.println("If you buy more than $1500, you can have $200 discount.");
        
        System.out.printf("Enter how much do you buy: ");
        cash = scn.nextInt();
        
        if(cash>=2000)//金額超過2000打9折
            payFor = cash - cash*0.1;
        else if(cash>=1500)//金額超過1500折200
            payFor = cash - 200;
        else
            payFor = cash;
            
        System.out.printf("your payfor is %.0f.", payFor);//結帳金額
	}

}
