public class ProductManager {
    public void add(Product product){
        ProductValidator validator=new ProductValidator();
        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi.");
        }else{
            System.out.println("Ürn bilgileri geçersizdir.");
        }
        ProductValidator productValidator=new ProductValidator();

    }
}
