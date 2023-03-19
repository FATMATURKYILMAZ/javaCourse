import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> sehirler= new ArrayList<String>();
        sehirler.add("Kocaeli");
        sehirler.add("Denizli");
        sehirler.add("Kastamonu");
        sehirler.add("Sakarya");

        sehirler.remove("Denizli");
        Collections.sort(sehirler);
        for(String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}