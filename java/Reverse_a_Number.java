import java.util.Scanner;
public class Reverse_a_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int b = sc.nextInt();
        int b=0;
        //int count=0;
        while(a>0){
            int rem = a%10;
            a = a/10;
            b = b*10 +rem;
            //count++;
            
        }
        //b = a/10;
        //count++;
        System.out.print(b);
        //b = a%10;
        sc.close();
    }
    
}
