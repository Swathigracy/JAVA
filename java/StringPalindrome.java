package Strings;
import java.util.Scanner;

public class StringPalindrome{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(checkPalindrome(str));
    }
    public static boolean checkPalindrome(String str){
        int i = 0;
        int n = str.length();
        for(i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;

            }

        }
        return true;
        
    }
    //sc.close();
        

        

}
