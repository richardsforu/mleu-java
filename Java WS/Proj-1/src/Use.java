/*

System.out.println()
-------------------------

-> System is a class which belongs to java.lang pakage
-> out is a static object which is type of java.io.PrintStream
-> print() and println() methods belongs to java.io.PrintStream class.

*/


class Use{
  Product p1=new Product();
  Product p2=new Product();


void f1(){ // non static ... Object must be created if you are invoking this method from static method
  p1.setData("P001");
  p2.setData("P002");
  Product.display(p1);
  Product.display(p2);
}

void f2(){
    f1(); // non static method can call any non static methods of the same class with out object.
    // to invoke f3 non static method from the Product class, this method needs Product class object.
     Product obj=new Product();
    obj.f3();

}

void f5(){
    // can accesss obj of Test class.
}


    static public void main(String[] args){

        System.out.println("---- main method ----");
        // Method must be defined immediate after a return type
       // p1.setData("P001");
       // p2.setData("P002");

   
      Use u=new Use();
       u.f1();

      



    }
}