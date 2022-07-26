package student.AhmetFeratKahraman;

public class lab03 {
    public static String checkifonce(String a){
    String once="";
    for (int i=0 ; i<a.length() ; i++){
        int count=0;
        for (int b=i ; b<a.length(); b++){
            if (a.charAt(i)==a.charAt(b)){
                count++;}}
        if(count==1){
            once+=a.charAt(i);}}
    return once;
}
    public static void main(String[] args) {
        System.out.println(checkifonce("aabbccddee"));
    }
}

