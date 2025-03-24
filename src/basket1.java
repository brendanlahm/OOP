public class basket1 {
   private Product[] products;
   
   public basket1(Product[] products){
       this.products = products;
   }

    public class Product {
       private String name;
       private int price;
       private int taxRate;

       public Product(String name, int price, int taxRate){
           this.name = name;
           this.price = price;
           this.taxRate = taxRate;
       }
    }
}

