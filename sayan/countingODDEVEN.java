package sayan;

import java.util.Scanner;

class count{
public void count(int arr[], int size){
    int even = 0;
    int odd = 0;
    for(int i = 0; i<size; i++){
        if(arr[i]%2 == 0) {
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.println("EVEN NUMBERS = "+even+" ODD NUMBERS = "+odd);
    
    }
}
public class countingODDEVEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        count eo = new count();
        System.out.println("ENTER THE SIZE OF ARRAY-->");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY-->");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        eo.count(arr, n);
       
    }
    
    
}
