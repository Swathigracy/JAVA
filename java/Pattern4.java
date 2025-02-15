import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0; j<=i;j++){
                System.out.print(" ");

            }
            for(int k=0;k<=(n-i); k++){
                System.out.print("*");
            }
            for(int l=0; l<(n)-i;l++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}
