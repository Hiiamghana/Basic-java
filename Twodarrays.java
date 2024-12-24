import java.util.*;
public class Twodarrays {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//        int[][] numbers = new int[rows][cols];
//        // for input
//        for (int i = 0; i < rows; i++) {// this is for rows input
//            for (int j = 0; j < cols; j++) {// this is for columns input
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//        // for out put
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(numbers[i][j]+" ");
//            }
//            System.out.println();
//        }
        //take a matrix as input from the user . search for a given number x and print the idices at which it occurs
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][]numbers=new int[rows][cols];
        // for inputs
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        // for give x for searching
        int x=sc.nextInt();
        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers.length;j++){
                if (numbers[i][j]==x){
                    System.out.println(" x is found at ("+i+","+j+")");
                }
            }
        }
    }
}
