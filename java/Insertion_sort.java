package Sorting;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {12,11,13,5,6};
        sort(arr);
        for(Integer i: arr){
            System.out.print(i+ " ");

        }
    }
    static void sort(int[] arr){
        for(int i=1; i< arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]> curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]= curr;

        }
        
    }
    
}
