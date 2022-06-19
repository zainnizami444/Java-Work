import java.util.Scanner;

public class CashDeposit extends BalanceProcess {

    Scanner input = new Scanner(System.in);
    int Depo;
    public void Deposit()
    {
        System.out.println("How Much Amount you have to Deposit" );
        int value = input.nextInt();

        try {
            if (value != 1000) {
                Depo = Balance + value;
                int FinalDepo = Balance * Fees / 100;
                Depo = Depo - FinalDepo;
                System.out.println("Your Balance After Deposit : " + Depo);
            } else {
                System.out.println("Balance must be greater than 1000");
            }
        }
        catch (Exception ex){
            System.out.println("Something went wrong");
        }

    }
}
