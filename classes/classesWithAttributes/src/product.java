public class product {
    public product(int id, String name, String description, int price, double stokAmount) {
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stokAmount;

    }

    //attributes | fields
    private int id;
     private String name;
     private String description;
     private int price;
     private double stockAmount;

     private String kod;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(double stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }



}
