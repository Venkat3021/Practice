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
*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("Hypotenuse = " + hypotenuse);
        sc.close();
    }
}
