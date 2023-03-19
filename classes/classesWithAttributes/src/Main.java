public class Main {
    public static void main(String[] args) {
        product product=new product(1,"Laptop","Asus laptop",5000,3);

//        product product=new product();
//        product.setName("laptop");
//        product.setId(1);
//        product.setDescription("Asus laptop");
//        product.setPrice(5000);
//        product.setStockAmount(5);

        productManager productManager=new productManager();
        productManager.add(product);
        System.out.println(product.getKod());
    }
}