package student.AhmetFeratKahraman;

public class lab06 {
    public static int max (int [] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10,100,-1000};
        System.out.println(max(array));
    }
}
