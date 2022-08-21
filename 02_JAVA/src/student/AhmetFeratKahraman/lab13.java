package student.AhmetFeratKahraman;

public class lab13 {
    public static int howmuch(String a) {
        for (int i = 0; i < a.length(); i++) {
            int count = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                }
            }
            System.out.println(a.charAt(i) + " is used " + count + " times");
        }
        int b = 0;
        return b;
    }
    public static void main(String[] args) {
        String name="asdsadasdasdasdsadsadasdasdsadasdasdasd";
        howmuch(name);
    }
}