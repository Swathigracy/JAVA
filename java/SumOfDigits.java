public class SumOfDigits {
    public static void main(String[] args){
        /*
        Summation of digits of numbers
        first picking number by remainder method by 10
        after picking the very next digit by the modulus and remainder method by 10
        and following the same method to get and store the values 
        and final sum will get.

    
         */
        int i=234;
        int sum=0;
        int lastdigit= i%10;
        sum+= lastdigit;
        System.out.println(sum);
        i = i/10;
        lastdigit= i%10;
        sum+=lastdigit;
        System.out.println(sum);
        i =i/10;
        lastdigit= i%10;
        sum+= lastdigit;
        System.out.println(sum);


        //sum+= lastdigit;

    }
    
}
