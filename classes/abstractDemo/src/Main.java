public class Main {
    public static void main(String[] args) {

       CustomerManager customerManager=new CustomerManager();
       customerManager.baseDatabase=new MysqlDatabase();
       customerManager.getCustomers();


    }
}