import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.io.*;

class Myexception extends Exception
{
    Myexception(int s)
    {   
        System.out.println("InvalidAmountException");
    }
}
public class bank {
    public static void main(String[] args) {
        int choice;
        int no=0;


        System.out.println("Enter the number of Accounts");
         Scanner sc = new Scanner(System.in);
        int Array_Length = sc.nextInt();

        Account obj[ ]= new Account[Array_Length];

        do{
        
        System.out.println("Enter the Operation: 1.Display 2. Search 3. Deposit 4. Withdraw 5. Exit 6. Create Account");
       
        choice = sc.nextInt();
        

        switch(choice)
        {
            case 1:
                System.out.println("Display");
                for(int i=0;i<no;i++)
                {
                    System.out.println("Name: "+obj[i].Name);
                    System.out.println("Account Number: "+obj[i].Account_Number);
                    System.out.println("Balance: "+obj[i].Balance);
                }
                    
                break;
            case 2:
                System.out.println("Search");
                System.out.println("Enter the account number whose details you want to display");
                    Scanner sc1 = new Scanner(System.in);
                    int disp_no = sc1.nextInt();
                    if(disp_no == obj[disp_no].Account_Number)
                    {
                        System.out.println("Name: "+obj[disp_no].Name);
                        System.out.println("Account Number: "+obj[disp_no].Account_Number);
                        System.out.println("Balance: "+obj[disp_no].Balance);
                    }
                    else
                    {
                        System.out.println("Account Number not found");
                    }
                break;
            case 3:
                System.out.println("Deposit");
                System.out.println("Enter the account number you want to deposit to:");
                Scanner sc3 = new Scanner(System.in);
                int depo = sc3.nextInt();
                try
                {   System.out.println("Enter the amount you want to deposit:");
                    int depo_amt = sc3.nextInt();
                    if (depo_amt<0) 
                    {
                        throw new Myexception(depo_amt);
                    }
                    else
                    {
                        obj[depo].Balance = obj[depo].Balance + depo_amt;
                        System.out.println("Your new balance is: "+obj[depo].Balance);
                    }
                }
                catch (Myexception e) {
                    System.out.println("InvalidAmountException");
                }
                break;
            case 4:
                System.out.println("Withdraw");
                System.out.println("Enter the account number you want to withdraw from:");
                Scanner sc4 = new Scanner(System.in);
                int with_acc = sc4.nextInt();
                try 
                {   
                    System.out.println("Enter the amount you want to withdraw:");
                    int with_amt = sc4.nextInt();
                    if(obj[with_acc].Balance<with_amt || with_amt<0)
                    {
                        throw new Myexception(with_amt);
                    }
                    else
                    {
                        obj[with_acc].Balance = obj[with_acc].Balance - with_amt;
                        System.out.println("Your new balance is: "+obj[with_acc].Balance);}

                   
                } 
                catch (Exception e) 
                {  
                    System.out.println("InsufficientFundsException");
                }
                break;
                
            case 5:
                System.out.println("Exit");
                break;
            case 6:
                System.out.println("Create");
                System.out.println("Enter the Name of Customer:");
                Scanner sc2 = new Scanner(System.in);
                String Name = sc2.next();
                obj[no] = new Account(Name, no);
                no++;
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }while(choice!=5);

    }
}

class Account{
    public String Name;
    public int Account_Number;
    public int Balance;

    Account(String Name, int Account_Number)
    {
        this.Name = Name;
        this.Account_Number = Account_Number; 
        this.Balance = 0;
    }
}


