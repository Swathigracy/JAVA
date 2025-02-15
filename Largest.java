import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner dv= new Scanner(System.in);
        int a= dv.nextInt();
        int b= dv.nextInt();
        int c= dv.nextInt();
        int max= Math.max(c, Math.max(a,b));
        System.out.println("Maximmum nnumber from the three numbers is:"+ max);
        dv.close();
    }
    
}
