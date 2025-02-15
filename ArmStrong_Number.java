import java.util.Scanner;
/*
 * Armstrong Number is a number that is equal when its sum of the each digit power of its total number
 *  of digits.
 * ex: 153, digits=3
 * i.e, 1^3+5^3+3^3=153
 */
public class ArmStrong_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int originalNumber= n;
        int sum=0;
        // here Math.log10(n) which is used to count the number of digits
        int numdigits= (int) Math.log10(n)+1;
        while(n>0){
            int digit = n%10;
            //Math.pow(n,power) method is used to power th number n with digit.
            sum+= Math.pow(digit,numdigits);
            n/=10;
        }
        if(sum == originalNumber){
            System.out.println("The given number is an Armstrong number: " + originalNumber);
        }else{
            System.out.println("It is not an Armstrong Number");
        }
        sc.close();

    }
    
}
