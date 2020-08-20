package shop;

public class Product {
    String name;
    int price;
    String manufactor;
    boolean gmo;

    public Product() {
    }
    public Product(String name,int price,String manufactor){
        this.name=name;
        this.manufactor=manufactor;
        this.price=price;

    }

    public static void main(String[] args) {
        System.out.println("Andru , good for you");
        Product prod=new Product("LG",3500,"Ukraine");
        Product prod1=new Product("LG",35000,"Ukraine");
        System.out.println(prod.name);
        System.out.println(prod.name);
        System.out.println(prod.name);
        prod.one();
        prod1.one();
        prod1.one();
        prod1.one();
        prod1.one();
        prod=prod1;
    }

    void one(){
        System.out.println("Working one()");
    }
}
