import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i; k++){
                
                System.out.print("*");
            }
            for(int l=1; l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
