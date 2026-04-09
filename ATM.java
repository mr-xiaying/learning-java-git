//import required classes and packages 
//withdraw取款；deposit存款；balance收支平衡；
import java.util.Scanner;  
  
//create ATMExample class to implement the ATM functionality  
public class ATM
{  //这里定义了一个静态方法，不属于类，无需创建对象就可以进行使用
  public static boolean validateInputAmount(Integer amount)
  {
    return amount>0;
  }
    //main method starts   
    public static void main(String args[] )  
    {  
        //declare and initialize balance, withdraw, and deposit声明并初始化这些变量的值
        int balance = 100000, withdraw, deposit;  
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
        while(true) //这里是一个死循环，目的是让这段菜单列表可以反复显示在界面之上 
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  //switch...case循环
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
        //get the withdrawl money from user  
        withdraw = sc.nextInt(); 
                if(!validateInputAmount(withdraw))//调用了静态方法
                {
                  System.out.println("Enter amount greater than zero");
                  break;
                }
                      
        //check whether the balance is greater than or equal to the withdrawal amount  
        if(balance >= withdraw)  
        {  
            //remove the withdrawl amount from the total balance  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            //show custom error message   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        //get deposite amount from te user  
        deposit = sc.nextInt();  
                 if(!validateInputAmount(deposit))
                {
                  System.out.println("Enter amount greater than zero");
                  break;
                }
                      
        //add the deposit amount to the total balanace  
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
        //displaying the total balance of the user  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        sc.close();
        //exit from the menu  
        System.exit(0);  
            }  
        }  
    }  
}  
