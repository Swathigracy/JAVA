package Strings;

public class ShortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";

        int x = 0;
        int y = 0;

        for (int i =0; i< str.length(); i++){
            char cur = str.charAt(i);
            if(cur == 'W'){
                x--;
            }else if(cur == 'N'){
                y++;
            }else if(cur == 'E'){
                x++;
            }else{
                y--;
            }
        }
        double distance = Math.sqrt(y*y + x*x);
        System.out.println("Distance of the ppoint:" + distance);
    }
}
