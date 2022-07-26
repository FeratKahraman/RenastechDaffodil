package student.AhmetFeratKahraman;

public class lab01 {
    public static String reverse(String str){
        int lastIndex=str.length()-1;
        String reverse="";
        for (int i = lastIndex; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        return  reverse;
    }
    public static void main(String[] args) {
        reverse("Ferat Kahraman");
        reverse("Linkin Park");
        reverse("Chester Bennington");
    }
}