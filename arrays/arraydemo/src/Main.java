public class Main {
    public static void main(String[] args) {
        double[] myList={1.2,3.4,7.8,9,6,6.3};
        double total=0;
        double max=myList[0];
        for (double number:myList){
            if (max>number){
                max=number;
            }
            total=number+total;
            System.out.println(number);
        }
        System.out.println("Total:" +total);
        System.out.println("Max number:" +max);
    }
}