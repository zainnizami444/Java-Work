import java.text.Format;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Atm Machine system  \n");
        Scanner input = new Scanner(System.in);
        char Y_N;
        do {
            System.out.println("Please Enter Your Card Pin");

            PinManagementSystem pin = new PinManagementSystem();
            chooseoption chooseoptions = new chooseoption();

            String inputpin = input.next();
            int p = Integer.parseInt(inputpin);
            if (p != pin.pins) {

                for (int count = 3; count >= 1; count--) {
                    System.out.println("You have " + count + " chances left");
                    inputpin = input.next();
                    p = Integer.parseInt(inputpin);
                    if (count == 1) {
                        System.out.println("You have 0 chances left");
                        System.out.println("Please contact your account manager your card has been blocked");
                        break;
                    }
                    if (p == pin.pins) {
                        pin.PinVerificationMethod(inputpin);
                        break;
                    }
                }
            } else {
                pin.PinVerificationMethod(inputpin);
            }

            int choosenumber = input.nextInt();
            if (choosenumber == pin.valueone || choosenumber == pin.valuetwo || choosenumber ==
                    pin.valuethree || choosenumber == pin.valuefour) {
                chooseoptions.option(choosenumber);
            } else {
                for (int count = 3; count >= 0; count--) {
                    System.out.println("You have " + count + " chances left");
                    if (count == 0) {
                        System.out.println("You have 0 chances left");
                        System.out.println("Please contact your account manager your card has been blocked");
                        break;
                    }
                    choosenumber = input.nextInt();
                    if (choosenumber == pin.valueone || choosenumber == pin.valuetwo || choosenumber ==
                            pin.valuethree || choosenumber == pin.valuefour) {
                        chooseoptions.option(choosenumber);
                        break;


                    }
                }
            }
            System.out.println("Press y to restart the process");
            String str = input.next();
             Y_N = str.charAt(0);
        }
        while(Y_N=='y');



    }
    }
