class Test{

/*
1. properties/variables/fields

properties/variables/fields
-----------------------------
1. instance properties
2. static properties
3. final properties
4. transient properties
5. volatile properties

1. instance properties
-------------------------
Instance data is availabe only to the specified object
ex: employee id

2. static properties
----------------------
Static data is available to all the objects

3. final properties
---------------------
const


2. methods
-----------
- instance methods
- static methods
- final methods
- abstract methods
- native methods


static methods
----------------
1. static methods can calll static data directly
2. sttaic methods can not call or invoke any non static data directly

instance methods
-------------------
1. Instance methods can call any other instance methods or variables directly
2. Instance methods can invoke or call or accesss static data directly

Q1: How to access non static data from a static method?
Ans: Object is needed to do the same.

Q2: In what context we need object creation?
    -> to access non static data from a static method, static methods need object
    -> To acess non static data of other class from a non static method, we need obejct

Q3: Where to craete an Object?
    -> Create an object in the static method, to acesss non static data of the same class or different class
    -> Create an object in the non static method to acess non static data from other class. 
    -> No need of creation of an object in the non static method, if you are accessing same class non static data
    -> Create Object in the class level (not in any of methods) to make accessbility of the object to all 
       static and non statoc methods in the class

Q4: Can I define static data as local to any of methods?
    -> No. Meaning of static itself global. Its illegal to define static as local variable to in any methods


3. Blocks
---------
    -> instance blocks
        -> Invokes before constructor.Invokes every time when object gets created
    -> static blocks
        -> Invokes before main method. There can be multiple static blocks. But each block executes only one time
           in the life cycle.


*/

int id=12000; // instance / non static 

static int x=100;

void f2(){ // non static method
 id=200;
 x=80000;
}
static void f1(){

    Test t=new Test();
    t.id=5000;
    System.out.println("Static method f1... "+t.id);
}

public static void main(String[] args){

System.out.println(Test.x); // any static data / method can be called directly or using a class name.
Test.f1();

//System.out.println(empId);


}


}