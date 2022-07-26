package student.AhmetFeratKahraman;

import java.util.Arrays;

public class lab07 {
    public static String concat(int[] a, int[] b) {
        int[] mix = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            mix[i] += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            mix[i + a.length] += b[i];
        }
        return Arrays.toString(mix);
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.out.println(concat(arr1, arr2));
    }
}
