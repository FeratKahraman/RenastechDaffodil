package student.AhmetFeratKahraman;

public class lab11 {
    public static void main(String[] args) {
    int i = 0;
    while (i <= 100) {
        if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
            System.out.println(i + " is divisible by 15");
        }
        i++;
    }
    i = 0;
    while (i <= 100) {
        if (i % 3 == 0 && i % 15 != 0) {
            System.out.println(i + " is divisible by 3");
        }
        i++;
    }
    i = 0;
    while (i <= 100) {
        if (i % 5 == 0 && i % 15 != 0) {
            System.out.println(i + " is divisible by 5");
        }
        i++;
    }
}
}
