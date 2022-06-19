import java.util.Scanner;

public class Billpayment implements Money {

    Scanner input = new Scanner(System.in);
    @Override
    public void options() {
        try {
            System.out.println("Please Pick  where do you want to pay the bill \n");
            System.out.println("1 : K - Electric \n");
            System.out.println("2 : Sui Southern Gas \n");
            System.out.println("3 : Karachi Water Board \n");
            System.out.println("4 : PTCL \n");

            String[] Bill = new String[5];
            Bill[0] = "";
            Bill[1] = "K - Electric";
            Bill[2] = "Sui Southern Gas";
            Bill[3] = "Karachi Water Board ";
            Bill[4] = "PTCL ";
            String Company = Bill[input.nextInt()];

            System.out.println("Please Enter Your " + Company + " Account Id ");

            String AccountId = input.next();
            BalanceProcess balanceProcess = new BalanceProcess();

            if (AccountId.length() == 10 && Company == Bill[1]) {
                balanceProcess.Deduction = balanceProcess.Balance - balanceProcess.electric;
                int finalamount = balanceProcess.Deduction * balanceProcess.Fees / 100;
                balanceProcess.Deduction = balanceProcess.Deduction - finalamount;
                System.out.println("According to your id " + AccountId + "  Your " + Bill[1] + " bill is : " + balanceProcess.electric + " and remaining " +
                        "Amount in your account is  : " + balanceProcess.Deduction);
            } else if (AccountId.length() == 10 && Company == Bill[2]) {
                balanceProcess.Deduction = balanceProcess.Balance - balanceProcess.gas;
                int finalamount = balanceProcess.Deduction * balanceProcess.Fees / 100;
                balanceProcess.Deduction = balanceProcess.Deduction - finalamount;
                System.out.println("According to your id " + AccountId + "  Your " + Bill[2] + " bill is : " + balanceProcess.gas + " and remaining " +
                        "Amount in your account is  : " + balanceProcess.Deduction);
            } else if (AccountId.length() == 10 && Company == Bill[3]) {
                balanceProcess.Deduction = balanceProcess.Balance - balanceProcess.water;
                int finalamount = balanceProcess.Deduction * balanceProcess.Fees / 100;
                balanceProcess.Deduction = balanceProcess.Deduction - finalamount;
                System.out.println("According to your id  " + AccountId + "   Your " + Bill[3] + " bill is : " + balanceProcess.water + " and remaining " +
                        "Amount in your account is  : " + balanceProcess.Deduction);
            } else if (AccountId.length() == 10 && Company == Bill[4]) {
                balanceProcess.Deduction = balanceProcess.Balance - balanceProcess.ptcl;
                int finalamount = balanceProcess.Deduction * balanceProcess.Fees / 100;
                balanceProcess.Deduction = balanceProcess.Deduction - finalamount;
                System.out.println("According to your id  " + AccountId + "  Your " + Bill[4] + " bill is : " + balanceProcess.ptcl + " and remaining " +
                        "Amount in your account is  : " + balanceProcess.Deduction);
            } else {
                System.out.println("Please enter the correct id ");
            }

        }
        catch (Exception ex)

        {
            System.out.println("Something went wrong");
        }
    }


}
