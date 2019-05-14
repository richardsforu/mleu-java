//import java.io.PrintStream;
class Sample{

public static void main(String[] numbers){


  // for each loop-> works only on arrays...

     int sum=0;
     for(String str:numbers){
         int no=Integer.parseInt(str);
         sum=sum+no;
       //  System.out.println(cityName);
     }

     System.out.println("Sum is "+sum);
    //String c1=cities[0];
    //String c2=cities[1];
   // System.out.println("City is "+c1);
   // System.out.println("City is "+c2);

  // PrintStream ps= System.out;
 //  ps.println("--- hello ...");
   //System.out.println("----- Working...");
}

}