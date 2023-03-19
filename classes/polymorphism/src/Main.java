public class Main {
    public static void main(String[] args) {
        BasedCredicManager[] creditManagers= new BasedCredicManager[]{new TeacherCreditManager(),new FramCredittManager(),new StudentCreditManager()} ;
        for(BasedCredicManager creditManager:creditManagers){
            System.out.println(creditManager.Hesapla(1000));
        }
        //override de methodu 'final' metodu ile besleyebiliriz.
    }
}