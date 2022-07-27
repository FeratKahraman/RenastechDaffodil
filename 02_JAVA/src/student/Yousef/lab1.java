package student.Yousef;



import java.util.Arrays;

<<<<<<< HEAD
class lab1 {
=======
public class Lab1 {
>>>>>>> 0b136b275ff80efeb4c3fe2c393134af0973b506
    public static void main(String[] args) {

        //Write a return method that can reverse  String
        // Ex: Reverse("ABCD"); ==> DCBA

        String name = "ABCD";
        String reversName="";
        String [] splitName = name.split("");
        System.out.println(Arrays.toString(splitName));

        for (int i = splitName.length-1; i >= 0 ; i--) {

            reversName+=splitName[i] + " ";


        }
        System.out.println("reversName = " + reversName);






    }


}