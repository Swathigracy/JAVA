import java.util.Scanner;

public class PythageronTriplet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(Math.pow(a,2)+ Math.pow(b,2)== Math.pow(c,2)){
            System.out.println("The given three numbers is a pythagereon triplets.");
        }else{
            System.out.println("It is not a pythagereon triplet.");
        }
        sc.close();
    }
    
}
