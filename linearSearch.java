import java.util.*;
public class linearSearch{
    public static int search(int a, int arr[], int b){
        for(int i = 0; i<a; i++){
            if(arr[i]==b){
                return i;
            
            }
            }
            return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE ARRAY DIMENSIONS-->");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.print("THE "+a+" ELEMENTS OF THE ARRAY ARE = ");
        for(int i = 0; i<a; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("ENTER THE SEARCHED VALUE-->");
        int b = sc.nextInt();
        int result = search(a, arr, b);
        if(result != -1){
            System.out.print("THE VALUE IS FOUND AT THE POSITION-->"+(result+1));
        }else{
            System.out.print("THE VALUE IS NOT FOUND");
        }
        

    }
}