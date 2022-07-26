package student.AhmetFeratKahraman;

import java.util.Arrays;

public class lab08 {
    public static int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
