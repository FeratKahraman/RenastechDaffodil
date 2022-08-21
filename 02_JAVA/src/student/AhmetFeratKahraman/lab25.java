package student.AhmetFeratKahraman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab25 {
    public static List<Integer> a(List<Integer> b){
        for (int i=0;i<b.size();i++){
            for (int i2=b.size()-1;i2>i;i2--) {
                if (b.get(i)>b.get(i2)){
                    int minimum=b.get(i);
                    b.set(i,b.get(i2)) ;
                    b.set(i2,minimum);
                }
            }
        }
        return b;
    }
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.addAll(Arrays.asList(15,13,20,23,1,17,23));

        System.out.println(a(a));
    }
}
