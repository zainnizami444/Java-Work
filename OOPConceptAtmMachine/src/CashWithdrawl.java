import java.util.Scanner;

public class CashWithdrawl implements Money   {
    Scanner input = new Scanner(System.in);

    @Override
    public void options() {
        try {
            System.out.println("Please Pick Amount \n");
            System.out.println("1 : 500 \n");
            System.out.println("2 : 1000 \n");
            System.out.println("3 : 10000 \n");
            System.out.println("4 : 20000 \n");
            System.out.println("5 : 25000 \n");
            System.out.println("6 : 30000 \n");
            int num = input.nextInt();
            int[] price = new int[7];
            price[0] = 0;
            price[1] = 500;
            price[2] = 1000;
            price[3] = 10000;
            price[4] = 20000;
            price[5] = 25000;
            price[6] = 30000;
            int ChoosenAmount = price[num];
            BalanceProcess balanceProcess = new BalanceProcess();
            balanceProcess.Deduction = balanceProcess.Balance - ChoosenAmount;
            int finalamount = balanceProcess.Deduction * balanceProcess.Fees / 100;
            balanceProcess.Deduction = balanceProcess.Deduction - finalamount;
            System.out.println("Your remaining Balance After Cash WithDrawl is : " + balanceProcess.Deduction);
        }
        catch(Exception ex)
        {
            System.out.println("Something went wrong");
        }

    }


}
