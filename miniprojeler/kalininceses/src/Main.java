public class Main {
    public static void main(String[] args) {
        char harf='L';
        switch (harf){
            case 'A':
            case 'O':
            case 'E':
            case 'I':
                System.out.println("Kalın sesli harf.");
                break;
            default:
                System.out.println("İnce sesli harf.");

        }
        System.out.println("Hello world!");
    }
}