import java.util.Scanner;
public class Future_Investment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the principal _Amount: ");
        double principle_amount = sc.nextDouble();
        System.out.println("Enter the Annaul_intrest rate : ");
        double Anual_intrest = sc.nextDouble();
        double rate = Anual_intrest/100;
        System.out.println("Enter the compounding years: ");
        double years= sc.nextDouble();
        int compunding= sc.nextInt();
        
        double futurevalue;
        
    }
    public static double calculateFutureValue(double principal, double rate, int years, int compoundingPeriods) {
        return principal * Math.pow(1 + rate / compoundingPeriods, compoundingPeriods * years);
    }
    
    
}
    

