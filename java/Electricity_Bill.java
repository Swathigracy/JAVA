import java.util.Scanner;
public class Electricity_Bill {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("how many watts does the regirator works:");
        int Refrigirator= sc.nextInt();
        System.out.println("Enter how much time daily regirator works:");
        int Refrigirator_Time = sc.nextInt();
        System.out.println("how many watts does the tubelight works:");
        int tubelight= sc.nextInt();
        System.out.println("Enter the time does it takes:");
        int tubelight_time= sc.nextInt();
        System.out.println("how many watts AC can took to work:");
        int AC= sc.nextInt();
        System.out.println("how much time does AC took time to run:");
        int AC_time = sc.nextInt();
        System.out.println("Enter the cost per watt:");
        int cost =sc.nextInt();
        int Electricity_bill;
        Electricity_bill = (((Refrigirator*Refrigirator_Time)+(tubelight*tubelight_time)+(AC*AC_time))*cost)/1000;
        System.out.println(Electricity_bill);
        sc.close();
        

















    }
    
}
