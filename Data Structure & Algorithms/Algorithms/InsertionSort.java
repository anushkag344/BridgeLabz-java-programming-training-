import java.util.*;
class InsertionSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        insertionSort(arr);
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++){
             System.out.print(arr[i] + " ");
        }
        sc.close();


    }
    static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
}