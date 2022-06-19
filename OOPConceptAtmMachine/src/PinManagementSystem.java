import java.lang.reflect.Array;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class PinManagementSystem implements  PrivateOrProtected {

   protected String UserPin ;
   public  int pins = FinalPin;
   public int VerifyPin;

   int valueone = 1;
   int valuetwo = 2;
   int valuethree = 3;
   int valuefour = 4;

   public void PinVerificationMethod(String Pin)
   {
   VerifyPin = Integer.parseInt(Pin);
      try {
         if (VerifyPin == 3443) {
            if (Pin.length() == 4) {
               System.out.println("Choose Your Option \n");
               System.out.println("1 : Cash WithDrawl \n");
               System.out.println("2 : Cash Deposit   \n");
               System.out.println("3 : Balance Enquiry\n");
               System.out.println("4 : Bill Payment   \n");
            }
         }
      }
      catch (Exception ex)
      {
         System.out.println("Something Went Wrong");
      }
      }

}
