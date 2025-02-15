import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<n-i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            // Print leading spaces
            for (int j = 0; j <=n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
        sc.close();

    }
    
}
