package student.AhmetFeratKahraman;

public class lab04 {
    public static String unique(String a){
        String result="";
        for (int i=0 ; i<a.length() ; i++) {
            String current=""+a.charAt(i);
            if (a.split(current).length<=2){
                result+=current;
            }}
        return result;
    }
    public static void main(String[] args) {
        System.out.println(unique("aabbccddefg"));
    }
}
