import java.util.Scanner;
public class Discount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double selling_price, discount, price, current_price;
        selling_price= sc.nextDouble();
        discount = sc.nextDouble();
        price = selling_price*(discount/100);
        System.out.println(price);
        current_price= selling_price-price;
        System.out.println(current_price);
        sc.close();
    }
    
}
