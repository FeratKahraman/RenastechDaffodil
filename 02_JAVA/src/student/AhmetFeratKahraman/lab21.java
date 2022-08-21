package student.AhmetFeratKahraman;

public class lab21 {
    public static void main(String[] args) {
        int divided = 11;
        int divider = 17;
        int division = 0;
        for(int i=0; divider<=divided; i++){
            divided = divided - divider;
            division++;
        }
        System.out.println(division);
    }
}
