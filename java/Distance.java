import java.util.Scanner;
public class Distance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Double x_coordinate1,y_coordinate1,x_coordinate2,y_coordinate2;
        x_coordinate1= sc.nextDouble();
        y_coordinate1=sc.nextDouble();
        x_coordinate2=sc.nextDouble();
        y_coordinate2=sc.nextDouble();
        double distance = Math.sqrt(Math.pow(x_coordinate2 - x_coordinate1, 2) + Math.pow(y_coordinate2 - y_coordinate1, 2));
        System.out.println(distance);
        sc.close();
    }
    
}
