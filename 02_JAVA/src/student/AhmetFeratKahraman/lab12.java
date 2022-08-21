package student.AhmetFeratKahraman;

import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("EVEN NUMBER WINS GAME");
        System.out.println("ENTER A NUMBER AND TRY TO MAKE IT EVEN");
        int a = input.nextInt();

        System.out.println(evenodd(a));
    }
    public static String evenodd(int b){
        String result="";
        if(b%2==0){
            result="NUMBER IS EVEN!!!!!! CONGRATS!!!!!!";
        }else{
            result="NUMBER IS ODD!!!!!!! TRY AGAIN!!!!!";
        }
        return result;
    }
}
