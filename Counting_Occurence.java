import java.util.Scanner;
public class Counting_Occurence {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lastdigit;
        int count=0;
        while(a>0){
            lastdigit = a%10;
            //lastdigit = a/10;
            if(lastdigit== b){
                System.out.println(count++);
            }else{
                System.out.println();
            }
            a = a/10;
        }
        System.out.println(count);
        sc.close();
    }
    
}
