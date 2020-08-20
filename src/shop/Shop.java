package shop;

import java.util.Arrays;

public class Shop {
    String adress;
    String[] contacts;

    public Shop(String adress,String[] contact33){
       this();
        this.adress=adress;
        this.contacts=contact33;
    }

    public Shop() {
        System.out.println("Constructor Shop()");
    }


    public static void main(String[] args) {
        int var=90;
     Shop   shop1=new  Shop("Marhlevskogo 34",new String[]{"123-23-34"});
   Shop shop2=new Shop();
        System.out.println(shop1.adress);
        System.out.println(Arrays.toString(shop1.contacts));
        System.out.println(Arrays.toString(shop2.contacts));
        System.out.println(shop2.adress);

}

  void one(int par){
        
  }
}

