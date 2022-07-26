package student.AhmetFeratKahraman;

public class lab05 {
    public static int max (int [] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10,100,1000};
        System.out.println(max(array));
    }
}