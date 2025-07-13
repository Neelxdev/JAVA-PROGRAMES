package sayan;

import java.util.Scanner;
class factorial{
    public int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}

public class recursiveFactorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER-->");
        int num = sc.nextInt();
        factorial f1 = new factorial();
        int result = f1.factorial(num);
        System.out.println("THE FACTORIAL OF "+num+" IS = "+result);
    }
}
