package student.AhmetFeratKahraman;

public class lab18 {
    public static int a(int b) {
        int result = 1;
        for (int i = b; i > 0; i--) {
          result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(a(5));
    }
}