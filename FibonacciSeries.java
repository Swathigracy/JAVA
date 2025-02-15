import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();
        int count=2;
        while( count<= n){
            int temp = b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
        sc.close();
    }
    
}
