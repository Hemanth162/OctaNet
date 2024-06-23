package OctaNet.in;
import java.util.Scanner;
/*
 OctaNet Services Pvt Ltd 
 Hemanth Annadurai
 ATM Machine (Task 1)
 */

class ATM
{
    float balance=5000;
    int PIN=2000;
    int choice;
    //To take input from user
    Scanner sc=new Scanner(System.in);
    void show()
    {
        System.out.println("\n ===================== * * *   WELCOME TO ATM MACHINE * * * ========================");
    }
    public void checkPin()
    {
        System.out.print("\nEnter your PIN :");
        int userPin=sc.nextInt();
        if(userPin==PIN) {
            menu();
        }
        else {
            System.out.println("INVALID PIN ,Please enter valid Pin !");
            checkPin();
        }
    }
    void menu() {
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println("------------------------------------------------------------------");
        System.out.print("\nEnter your choice  :");
        choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("\nYour Account Balance is :"+balance);
                System.out.println("------------------------------------------------------------------");
                    menu();
                    break;}

            case 2: {
                System.out.print("Enter amount to withdraw : ");
                float with_amount = sc.nextInt();
                if(with_amount<=balance) {
                    System.out.println("Money withdraw successfully  ");
                    balance = balance - with_amount;
                    System.out.println("Amount left : " + balance);
                }
                else {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("------------------------------------------------------------------");
                menu();
                break;
            }
            case 3: {
                System.out.print("\nEnter amount to Deposit :");
                int amountDeposit=sc.nextInt();
                System.out.println("Amount deposited successfully ");
                balance=balance+amountDeposit;
                System.out.println("Total Amount  :"+balance);
                System.out.println("------------------------------------------------------------------");
                menu();
                break;
            }
            case 4: {
                System.out.println(" ==================== * * *  THANK YOU FOR VISITING THE ATM   * * * =====================");
                break;
            }
        }
    }
}
public class ATM_Machine {
    public static void main(String arg[])
    {
    ATM a=new ATM();
    a.show();
    a.checkPin();
    }
}
