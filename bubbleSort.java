import java.util.Scanner;

public class bubbleSort {
    static void sorting(int arr[], int size){
        for(int i = 0; i<size-1;i++){
            for(int j = 0; j<size-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY-->");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("THE ELEMENTS OF THE ARRAY OF SIZE "+n+" IS-->");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sorting(arr, n);
        System.out.println("THE SORTED ARRAY IS-->");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}