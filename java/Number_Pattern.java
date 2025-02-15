import java.util.Scanner;
public class Number_Pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<n-i;j++){
                System.out.print(" ");
            }
            System.out.print("1");
            if(i>1){
                for(int k=1; k<i; k++){
                    
                    //System.out.print(" ");
                    if(i==3){
                        //for(int k=0; k<i; k++ ){
                            k = (i-1);
                            
                            System.out.print(" "+k);
                        //}
                    }
                    if(i==4){
                        k= i-1;
                        int l= k+1;
                        l = i-1;
                        System.out.println(" "+k+" "+ l);
                    }
                    if(i==5){
                        k= i-1;
                        //int o= i-1;
                        int m=k+1;
                        int p=k+2;
                        m = i+1;
                        p = i-1;
                        System.out.println(" "+k+" "+m+ " "+p);
                    }
                    System.out.print(" 1");
                }
            }
            System.out.println();
                //System.out.print("1");
        }
        System.out.println();
    }
}
    

