import java.util.*;
public class Functions {
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }
//    public static void main(String args[]){
//        Scanner sc= new Scanner(System.in);
//        String name=sc.next();
//        printMyName(name);// call the function in main function
//    }
  // Make a function to add 2 number and returm the sum
//  public static int sumOfNumber(int a,int b){
//     int sum=a+b;
//      return sum;
//  }
//  public static void main(String args[]){
//      Scanner sc=new Scanner(System.in);
//      int a=sc.nextInt();
//      int b=sc.nextInt();
//      int sum=sumOfNumber(a,b);
//      System.out.println("sum of 2 numbers is :"+sum);
//  }
    // Make a function to multiplay 2 number and return the product
//    public static int productOfNumbers(int a,int b){
//        int mul=a*b;
//        return mul;
//    }
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int mul=productOfNumbers(a,b);
//        System.out.println("the multiplication of numbers is "+mul);
//    }
    // Find the factorial of any number
    public static void printFactorial(int n){
        if (n<0)
        {
            System.out.println("invalid input");
            return;
        }
        int i,factorial=1;
        for (i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return ;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printFactorial(n);
        //System.out.println(factorial);
    }
}
