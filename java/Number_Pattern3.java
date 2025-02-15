import java.util.Scanner;
public class Number_Pattern3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum=0;
        for(int i=1; i<=5 ; i++ ){
            
            for(int j=1; j<=i ; j++){
                if(i%2==1){
                    int m= j%2;
                    System.out.print(m);

                }
                if(i%2==0){
                    int m= (j+1)%2;
                    System.out.print(m);
                }
                //System.err.println();
            }
            System.out.println();
            
        }
        

    }
    
}
