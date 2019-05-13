class Employee{
    int empId;
    static String companyName;

    Test t=new Test();

{ // instance blocks
    System.out.println("--- Instance block "+this.hashCode());
}
static{ // static block
    System.out.println("--- Static block 1... ");
}

static{ // static block
    System.out.println("--- Static block 2... ");
}

static{ // static block
    System.out.println("--- Static block 3... ");
}

Employee(){ // Constructor
    System.out.println("--- Employee object got created... "+this.hashCode());
}

    void f1(){
        //static int y=1000; static data can not de declared as local
        System.out.println("Company from f1: "+companyName);
        Test t1=new Test();
        // t1 can access all the non static data from Test class alone....
        // t is accessble here
    }

    static void f2(){
        companyName="CTS";
        Test t2=new Test();
        // t2 can access all non static data from the Employee and Test class
        // t is accessble here
    }

    public static void main(String[] args){

        System.out.println("--- Main method");
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();

        e1.empId=10;
        e2.empId=20;
        e3.empId=30;


        companyName="Cognizant";


        System.out.println("E1: "+e1.empId);
        System.out.println("E2: "+e2.empId);
        System.out.println("E3: "+e3.empId);

        System.out.println("E1 Company: "+companyName);
        System.out.println("E2 Company: "+companyName);
        System.out.println("E3 Company: "+companyName);

        System.out.println("------------------------------------");
        
        f2();
        e1.f1();

        companyName="Cognizant Technologies";

        System.out.println("E1 Company: "+companyName);
        System.out.println("E2 Company: "+companyName);
        System.out.println("E3 Company: "+companyName);

        System.out.println(Test.x);

        Test t=new Test();

        System.out.println(t.id);
    

    }
}