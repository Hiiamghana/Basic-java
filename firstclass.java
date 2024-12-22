import java.util.*;
public class firstclass {
    public static void main(String args[]){
        System.out.println("hello biswajit");
        System.out.println("please enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println(a+b);
        if (a<0){
            System.out.println("its negetive");
        } else if (a==0) {
            System.out.println("its zero");

        }else
            System.out.println("its positive");
    }
}
