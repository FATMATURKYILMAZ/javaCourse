public class Main {
    public static void main(String[] args) {
        customerManager customerManager=new customerManager();
        customerManager.add();
        customerManager.delete();
        customerManager.update();
        //classlar referans tip(reference type)
        //value
        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=30;
        System.out.println(sayi1);

        int[] sayilar1=new int[]{1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=60;
        System.out.println(sayilar2[0]);
    }
}