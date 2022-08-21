package student.AhmetFeratKahraman;

public class lab14 {
    public static void main(String[] args) {
        String a="a1a2a3a4a5a6a7a8a9a";
        System.out.println(sum(a));
    }
    public static int sum(String a){
        char[] b = a.toCharArray();
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            if (Character.isDigit(b[i])) {
                int c = Integer.parseInt(String.valueOf(b[i]));
                sum = sum + c;
            }
        }
        return sum;
    }
}
