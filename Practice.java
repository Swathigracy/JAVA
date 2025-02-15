//package Array;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maximmum(a,b,c);
        minimmum(a,b,c);

    }
    public static void maximmum(int a,int b,int c){
        if (a>b && a>c){
            System.out.println("A is greater than other two numbers.");


        }else if(b>a && b>c){
            System.out.println("B is greater than other two numbers.");
        }
        else{
            System.out.println("C is greater than two numbers.");
        }
    }
    public static void minimmum(int a,int b,int c){
        if (a<b && a<c){
            System.out.println("A is Smaller than other two numbers.");


        }else if(b<a && b<c){
            System.out.println("B is smaller than other two numbers.");
        }
        else{
            System.out.println("C is smaller than two numbers.");
        }
    }
    



}


