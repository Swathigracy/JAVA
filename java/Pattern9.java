import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<n ; i++){
            for( int j=1; j<=4;j++){
                System.out.print("*");
            }
            
            if(i>1 && i<n){
                System.out.print("*"+" "+"*");
            }
            //System.out.println();
            
            for( int j=1; j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
