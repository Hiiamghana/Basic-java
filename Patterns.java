public class Patterns {
    public static void main(String args[]){
        // print solid ractangle
//        for (int i=1;i<=4;i++) {
//            for (int j = 1; j<=5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // print hollow rectabgle
//        int i,j,n=4,m=5;
//        for (i=1;i<=n;i++) { //this is for inner loop
//
//            for(j=1;j<=m;j++){
//                if (i==1||j==1||i==n||j==m){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//
//        }
//            System.out.println();
//        }
        // print half piramit
//        int i,j,n=4;
//        for (i=1;i<=n;i++){
//            for (j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //print ulta half piramit
//        int i,j,n=4;
//        for (i=1;i<=n;i++){
//            for (j=n;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //print ulta half piramit rotate 180 degree
//        int i,j,n=4;
//        for(i=1;i<=n;i++){
//            for (j=1;j<=n-i;j++){// this is for inner space
//                System.out.print(" ");
//            }
//            for (j=1;j<=i;j++){// this ios for print star
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // print half piramit with numbers
//        int i,j,n=5;
//        for (i=1;i<=5;i++){
//            for (j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        // print invarted half piramit with number
//        int i,j,n=5;
//        for (i=1;i<=n;i++){
//            for (j=1;j<=n-i+1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        // print floyds Triangle
//        int i,j,n=5,number=1;
//        for (i=1;i<=n;i++){
//            for (j=1;j<=i;j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }
        // print 0-1 tiangle
        int i,j,n=5;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                int sum=i+j;
               if(sum%2==0){
                   System.out.print("1 ");
               }else{
                   System.out.print("0 ");
                    }

            }
             System.out.println();
        }

    }
}
