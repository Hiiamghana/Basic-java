public class Advancepattern {
    public static void main(String args[]) {
//        int i, j, n = 5;
        // print hollow full pyramid
//        for (i = 1; i <= n; i++) {
//            for (j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (j = 1; j <= (2 * i - 1); j++) {
//                if (j == 1 || j == (2 * i - 1) || i == n) {// this is for the space in the  middle
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        // print butterfly pattarn
//        int i,j,n=5;
//        for (i=1;i<=n;i++){// this is for the upper part
//            for (j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int spaces=2*(n-i);
//            for (j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            for (j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // to print the lower half
//        for (i=n;i>=1;i--){
//            for (j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int spaces=2*(n-i);
//            for (j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            for (j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //print solid rhombus
//        int i,j,n=5;
//        for (i=1;i<=n;i++){
//            for(j=1;j<=n-i;j++){// this is for print spaces
//                System.out.print(" ");
//            }
//            for (j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // print number pyramid
//        int i,j,n=5;
//        for (i=1;i<=n;i++){
//            for (j=1;j<=n-i;j++){// to print the spaces
//                System.out.print(" ");
//
//            }
//            for (j=1;j<=i;j++){// to print number
//                System.out.print(i);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        // print palindromic pattern
//        int i,j,n=5;
//        for (i=1;i<=n;i++){
//            for (j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (j=i;j>=1;j--){// this is for the first half of number
//                System.out.print(j);
//            }
//            for (j=2;j<=i;j++){// this is for second half part
//                System.out.print(j);
//
//            }
//            System.out.println();
//        }
//
    // print diamond pattern
        int i,j,n=4;
        for (i=1;i<=n;i++){ // this is for upper half
            for (j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=n;i>=1;i--){ // this is for lower half
            for (j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}