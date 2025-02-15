import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int i = sc.nextInt();
        sc.close();
        boolean prime= true;
        int i=2;
        for( i=2; i<n ; i++){
            if(n%i==0){
                prime=false;
                System.out.println(prime);
                break;
            }
        

        }
        System.out.println(prime);
    }
}