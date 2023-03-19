public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number=28;
        int total=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                total=i+total;
            }
        }
        if (number==total){
            System.out.println("Sayı mükemmel sayıdır.");
        }else{
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}