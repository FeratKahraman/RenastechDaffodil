package student.AhmetFeratKahraman;

import java.util.ArrayList;
import java.util.Arrays;

public class lab23 {
    public static void main(String[] args) {

        String[] names= {"Amed",  "Eric", "John", "Eric", "Amed" , "Eric"};
        ArrayList<String> nameslist=new ArrayList<>();
        nameslist.addAll(Arrays.asList(names));

        for (int i = 0; i < nameslist.size(); i++) {
            if (!nameslist.get(i).equals("Eric")){
                nameslist.remove(nameslist.get(i));
            }
        }
        System.out.println(nameslist);
    }
}
