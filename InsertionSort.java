public class InsertionSort {
    public static void printArray(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};

        for (int i=1;i< arr.length;i++){
            int sotet=arr[i];
            int j=i-1;
            while(j>=0 && sotet<arr[j] ){
                arr[j+1]=arr[j];
                j--;
            }
            //placement or swapping
            arr[j+1]=sotet;
        }
        printArray(arr);
    }
}
