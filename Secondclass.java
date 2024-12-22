import java.util.*;
public class Secondclass {
    public static void main(String args[]) {
        // for loop
//        for (int i=1;i<=5;i++){
//            System.out.println("hello for loop");
//            System.out.println(i);
//        }
//        for(int i=0;i<=10;i++){
//            System.out.print(i);
//        }
        //while loop
//        int i=0;
//        while(i<=10){
//            System.out.println(i);// use print for single line out put
//            i++;
//        }
        // do while loop
//        int i=0;
//        do {
//            System.out.println(i);
//            i++;
//        }while(i<=10);
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        int i,sum=0;
//        for(i=1;i<=n;i++){
//             sum=sum+i;
//        }
//        System.out.println(sum);// to print sum of first n number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, c;
        for (i = 1; i < 10; i++) {
            System.out.println(n * i);// to print the table
        }
    }
}
