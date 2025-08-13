/*import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum;
        int middle;

       int max1=Math.max(a,b);
       int max=Math.max(max1,c);
       int min1=Math.min(a,b);
       int min=Math.min(min1,c);
       sum=a+b+c;
       middle=sum-(min+max);
       System.out.println(middle);

        sc.close();
    }
}*/
/*import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp= sc.nextInt();
        if(temp>=50){
         System.out.println("Hot");
        }
        else if(temp>=30){
            System.out.println("Humid");
        }
       else if(temp>=15){
            System.out.println("Cold");
        }
        else{
            System.out.println("Freezing");
        }
       
        
       
        sc.close();
    }
}

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1= sc.nextInt();
        int a2= sc.nextInt();
        int a3= sc.nextInt();
        int sum=a1+a2+a3;
        if(a1<=0|| a2<=0||a3<=0){
            System.out.println("The given any one of angle May Be Zero Or Negative");
        }
       else if(sum==180){
            System.out.println("Triangle");
        }
        
        else{
             System.out.println("Not a Triangle");
        
        }
        sc.close();
    }
}
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1= sc.nextInt();
        int a2= sc.nextInt();
        int target= sc.nextInt();
        int diff1 = Math.abs(target - a1);
        int diff2 = Math.abs(target - a2);
        int close;
        if(diff1 <= diff2){
            close = a1;
        } else {
            close = a2;
}

        System.out.println(close);
        sc.close();
    }
}
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1= sc.nextInt();
        int a2= sc.nextInt();
        int a3= sc.nextInt();
        int a4= sc.nextInt();
        int min=Math.min(Math.min(a1,a2),Math.min(a3,a4));
        System.out.println(min);
        sc.close();
}
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double hypotenuse =(Math.pow(side1, 2) + Math.pow(side2, 2));
        double equalside=Math.pow(side3,2);
        if(side1<=0||side3<=0||side2<=0){
        if(hypotenuse==equalside){
            System.out.println("pythagerous");
        }
        
        else{
            System.out.println("Not a Pythagerous");
        }
        
        sc.close();
    }
}
*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Name:");
       String name=sc.nextLine();
       System.out.println("Enter Your Age:");
       int age=sc.nextInt();
       System.out.println("Enter Your Number:");
       String number=sc.nextLine();
       sc.nextLine(); 
       System.out.println("Enter Your Gender:");
       String gender=sc.nextLine();
       System.out.println("Enter Your Balance:");
       double Balance=sc.nextDouble();
       sc.nextLine();
       System.out.println("Do You Want Loan:");
       String loan=sc.nextLine();

         switch(loan){
               case "yes":
                   System.out.println("Enter Your Loan Amount?:");
                   double loanAmount=sc.nextDouble();
                   System.out.println("Enter number of years to repay:");
                   int years = sc.nextInt();
                   double interestRate=9.1;
                   double interest=(loanAmount*interestRate*years)/100;
                   double totalPayable=loanAmount+interest;
                   System.out.printf("Interest :%.2f\n",interest);
                   System.out.printf("Payable Amount: %.2f\n",totalPayable);
                   Balance+=loanAmount;
                   sc.nextLine();
                   break;
              case "no":
                  System.out.println("No Loan Selected");
                  break;
              default:
              System.out.println("Inavlid option");
           }
        System.out.println("Do you want to deposit or withdraw?");
        String action = sc.nextLine();

        switch (action) {
            case "deposit":
                System.out.println("Enter amount to deposit:");
                double deposit = sc.nextDouble();
                if (deposit > 0) {
                    Balance += deposit;
                    System.out.println("Deposit successful.");
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                break;

            case "withdraw":
                System.out.println("Enter amount to withdraw:");
                double withdraw = sc.nextDouble();
                if (withdraw > 0 && withdraw <= Balance) {
                    Balance -= withdraw;
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Invalid or insufficient funds.");
                }
                break;

            default:
                System.out.println("Invalid transaction option.");
        }
        sc.close();
    }
}
/*import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
        String rev="";
       while(len>0){
           rev+=s.charAt(len-1);
           len--;
       }
       if(rev.equals(s)){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not a Palindrome");
       }
        
	}
}
*/
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String password = sc.nextLine();         
        String confirmpassword = sc.nextLine();    
        int count = 0;      
        int maxAttempts = 3;
        
        while (count <= maxAttempts) {
            
            if (password.equals(confirmpassword)) {
                System.out.println("Your Password is Correct!");
                break;  
            } else {
                System.out.println("Invalid Password! Try Again!");
                count++;  
                 System.out.println("Count:"+count);
                if (count <= maxAttempts) {
                    
                    password = sc.nextLine(); 
                    confirmpassword = sc.nextLine();
                } else {
                    System.out.println("Max attempts reached. Access denied.");
                }
            }
       
        }
    }
}
*/
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();   
        String str=str1.toLowerCase();
        String vow = "";      
        String con="";
      for (int i = 0; i < str.length(); i++) {
            char chara = str.charAt(i);  
            if(chara=='a'||chara=='e'||chara=='i'||chara=='o'||chara=='u'){
                vow+=chara;
            }
            else{
                con+=chara;
            }
        }
       String vowelsandCon=vow+con;
       System.out.println(vowelsandCon);
    }
}
*/
