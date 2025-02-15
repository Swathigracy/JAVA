import java.util.Scanner;
public class Else_if {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a>=90){
            System.out.println("A grade");
        }else if(a>=80){
            System.out.println("B Grade");
        }else{
            System.out.println("C Grade");

        }
        sc.close();

    }
    
}
