import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int d=0;
        int rem= n%10;
        int newNum = d*10 + rem;
        System.out.println("The new number is:"+ newNum);
        n=n/10;
        if(n<0){
            System.out.println("It is  a negative number.");
        }
        sc.close();
    }
    
}
