public class Main {
    public static void main(String[] args) {
        String[] ogrenciler=new String[4];
        ogrenciler[0]="Fatma";
        ogrenciler[1]="Ela";
        ogrenciler[2]="Esma";
        ogrenciler[3]="Songül";
        for(int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        for(String ogrenci:ogrenciler){//bu kullanım daha çok tercih edilir. ogrenci yerine herhangi bir şey yazılabilir
            System.out.println(ogrenci);
        }

        System.out.println("Hello world!");
    }
}