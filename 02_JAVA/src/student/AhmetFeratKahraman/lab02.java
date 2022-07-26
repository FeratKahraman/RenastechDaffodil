package student.AhmetFeratKahraman;

import java.util.Arrays;

public class lab02 {
    public static boolean sameletters(String a, String b){
        boolean result;
        String[] arrayA=a.split("");
        String[] arrayB=b.split("");
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        if (Arrays.toString(arrayA).equals(Arrays.toString(arrayB))) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sameletters("asd", "das"));
        System.out.println(sameletters("asd", "aaa"));
    }

}
