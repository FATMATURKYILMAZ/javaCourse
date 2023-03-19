public class Main {
    public static void main(String[] args) {
        int[] sayi= new int[]{1,4,7,9,6};
        int aranacakSayi=8;
        boolean varMi=false;
        for (int sayilar: sayi){
            if(sayilar==aranacakSayi){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayı vardır.");
        }else {
            System.out.println("Sayı yoktur.");
        }
        System.out.println("Hello world!");
    }
}