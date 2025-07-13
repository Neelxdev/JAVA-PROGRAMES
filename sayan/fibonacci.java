package sayan;

import java.util.*;

public class fibonacci {
    static int recursion(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return recursion(n-1)+recursion(n-2);
        }

}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE TERM-->");
    int n = sc.nextInt();
    if(n<0){
        System.out.println("PLEASE ENTER A PROPER VALUE");
    }else{
        System.out.println("THE FIBONACCI SERIES UPTO "+n+" TERMS BE -->");
        for(int i = 0; i<=n;  i++){
        System.out.println(recursion(i));
    }
}
}
    
}
