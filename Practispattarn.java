public class Practispattarn {
    public static void main(String args[]){
        int i,j,n=5;
//        for (i=1;i<=n;i++){
//            for (j=1;j<=i;j++){
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }

//        for (i=1;i<=n;i++){
//            for (j=1;j<=n-i;j++){
//                System.out.print(" ");
//
//            }
//            for (j=1;j<=i;j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();

//        for (i=1;i<=n;i++){
//            for (j=n;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (i=1;i<=n;i++){
            for (j=i;j<n;j++){
                System.out.print(" ");
            }
            for (j=1;j<=(2*i-1);j++){
                if (j==1||j==(2*i-1)||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
