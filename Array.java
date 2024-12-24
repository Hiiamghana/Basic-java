import java.util.*;
public class Array {
    public static void main(String args[]) {
//        int[] mark=new int[3];
//        mark[0]=97;
//        mark[1]=95;
//        mark[2]=98;
        // or we also use the 2nd option
//        int mark[]={97,95,98};
////        System.out.println(mark[0]);
////        System.out.println(mark[1]);
////        System.out.println(mark[2]);
//        // to avoid multiple line in code use
//        for (int i=0;i<3;i++){
//            System.out.println(mark[i]);
//        }
//        // user calling array create
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int numbers[]=new int[size];
//        // for user inputs
//        for (int i=0;i<size;i++){
//            numbers[i]=sc.nextInt();
//        }
//        // for output
//        for (int i=0;i<size;i++){
//            System.out.println(numbers[i]);
//        }
        // take an array as input from user search for a given number x and print the index at which it occurs
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int number[] = new int[size];
        // for user input
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        // for searching x
        int x = sc.nextInt();
        // for output
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("x found at " + i);// this is also known as linear search
            }
        }
    }
}
