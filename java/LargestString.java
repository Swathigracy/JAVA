package Strings;

public class LargestString {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "ABCDEF"};

        String s = "";
        int len = 0;
        for(int i =0;i< words.length; i++){
            if(words[i].length() >len){
                s = words[i];
                len = words[i].length();
            }
        }
        System.out.println("The longest string in the Array:"+ s);
    }

    
}
