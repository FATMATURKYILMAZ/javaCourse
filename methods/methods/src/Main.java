public class Main{

    public static void main(String[] args) {
        String mesaj="Merhablar efendim";
        int sayi=topla(19,90);
        System.out.println(sayi);

        }
    public static void  sil(){
        System.out.println("silindi...");
    }
    public static void ekle(){
        System.out.println("eklendi...");
    }
    public static int topla(int sayi1,int sayi2){
        int toplam;
        toplam=sayi1+sayi2;
        return toplam;
    }

}
