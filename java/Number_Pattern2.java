import java.util.Scanner;
public class Number_Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        //int m = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<i ; j++){
                sum=sum+1;
                System.out.print(sum+" ");
                //System.out.println();

            }
            System.out.println();
            
            

        }
        sc.close();
        //System.out.println();
    }
    
}
