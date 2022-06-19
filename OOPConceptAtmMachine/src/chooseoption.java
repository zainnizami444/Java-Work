import java.util.Calendar;
import java.util.Scanner;

public class chooseoption extends  PinManagementSystem {

    Scanner input = new Scanner(System.in);
    public void option(int value)
    {
        if (value == valueone){
            CashWithdrawl cashWithdrawl = new CashWithdrawl();
            cashWithdrawl.options();

        }
        if (value == valuetwo){
            CashDeposit cashDeposit = new CashDeposit();
            cashDeposit.Deposit();
        }
        if (value == valuethree){
          BalanceEnquiry balanceEnquiry = new BalanceEnquiry();
          balanceEnquiry.Account();

        }
        if (value == valuefour){
            Billpayment billpayment = new Billpayment();
            billpayment.options();
        }



    }
}
