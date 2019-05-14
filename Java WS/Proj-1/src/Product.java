class Product{

  String productId;
  static String storeName;

  void setData(String id){ // non static -> must be called with Product object, if you are calling from diffrent class
      productId=id;
      storeName="HYD-Store";
  }

  static void display(Product prod){ // this method must be called with Product class name, if it is invoking from different class
      System.out.println("Product Id: "+prod.productId);
      System.out.println("Store Name: "+storeName);
  }

  void f3(){
      
  }




}