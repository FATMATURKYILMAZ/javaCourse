import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(8);
        sayilar.add("Kocaeli");
        //System.out.println(sayilar.size());
        //sayilar.set(2,10000);
        //sayilar.remove(0);
        //sayilar.clear();
        //System.out.println(sayilar.get(0));

        for(Object i:sayilar){
            System.out.println(i);
        }
    }
}