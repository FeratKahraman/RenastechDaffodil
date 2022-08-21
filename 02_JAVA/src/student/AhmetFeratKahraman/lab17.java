package student.AhmetFeratKahraman;

import java.util.Arrays;

public class lab17 {
    public static int[] a(int[] b) {
        int c = 0;
        int[] arr = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 0) {
                c++;
            } else {
                arr[i - c] = b[i];
            }

        }

        for (int i = b.length - 1; i >= b.length - c; i--) {
            arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {22,12,0,0,54,0,23,15,3,0};
        System.out.println(Arrays.toString(a(a)));
    }
}