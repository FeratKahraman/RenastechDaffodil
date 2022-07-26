package student.AhmetFeratKahraman;

import java.util.Arrays;

public class lab09 {
    public static int[] sort(int[] arr){
        int a=arr[0];
        for (int i=0; i< arr.length ;i++){
            for (int b=0;b<arr.length;b++){
                if(arr[i]>arr[b]){
                    a=arr[i];
                    arr[i]=arr[b];
                    arr[b]=a;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
