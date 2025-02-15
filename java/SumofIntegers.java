import java.util.Scanner;
public class SumofIntegers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int Sum=0;
        for(int i=0; i<=n; i++){
            Sum=Sum+i;
            //System.out.println("The first sum of the first n natural numbers"+Sum);
        }
        System.out.println("The first sum of the first n natural numbers"+Sum);
        sc.close();
    }
    
}
