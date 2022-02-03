package work;

public class Main {

    // main method

    public static void main (String args []){

        System.out.println("My system start....");
     //  Runnable : we want to see the value of Runnable interface then we will use ctrl and click on Runnable
     // similarly we can see Callable ,Comparable interface


        // to create object of class
        // Arbitrary_class arbitrary_object (classname object_name)
        // step1: classname variable_name = new classname(); // variable name of first class (left side)
        //step2 : variable_name.method_name(); // to call method


        MyInterImpl myInter = new MyInterImpl();  // imp point 1: create separate class and implement this interface
        myInter.sayHello();

        MyInter myInter1 = new MyInterImpl();

        myInter.sayHello();


       // anonymous class for implementing interface without name

      MyInter i = new MyInter() {
          @Override
          public void sayHello() {

           System.out.println("This is my first anonymous class ");

          }
      };

      i.sayHello();


        MyInter i2 = new MyInter() {
            @Override
            public void sayHello() {

                System.out.println("This is my second anonymous class ");

            }
        };

        i2.sayHello();


       // using our interface with the help of Lambda expression

        MyInter i3 =()->{
            System.out.println("This is first time i am using lambda expression");

        };

       i3.sayHello();

       // lambada expression : removed curly braces because only one statement is available
       MyInter i4 =()-> System.out.println("This is first time i am using lambda expression");

        i4.sayHello();

       // using our SumInter(interface) with the help of Lambda expression
       SumInter i5 = (int a,int b)->{

           return a+b;
       };

      System.out.println(i5.sum(2,6));
      System.out.println(i5.sum(4,7));


      // using second rule of lambda expression :
        // java compiler also inter the type of variable passed in arguments, hence type is optional

        SumInter i6 = ( a, b)-> a+b;     //we can remove return, type (int ,String,Double) according to second rule of lambda
                                          // we can remove curly braces according to first rule of lambda expression
        System.out.println(i5.sum(2,6));
        System.out.println(i5.sum(4,7));



        LengthInter lengthInter = (str)->{
            return str.length();

        };


       System.out.println("The length of String is :"+lengthInter.getLength("Durgesh Tiwari"));
        System.out.println("The length of String is :"+lengthInter.getLength("Alka Goyal"));

       // using two rules of lambda expression

        LengthInter lengthInter1 = (str)->str.length();


        System.out.println("The length of String is :"+lengthInter.getLength("Durgesh Tiwari"));
        System.out.println("The length of String is :"+lengthInter.getLength("Alka Goyal"));


    }




}

// note: in java 7(1.7) or java 6 FUNCTIONAL INTERFACE WILL COMPLETE THROUGH ALL PROCESS
// The length or size of a string means the total number of characters present in it.
// For Example: The string “Geeks For Geeks” has 15 characters (including spaces also).
// Geeks For Geeks : 13 alphabets and 2 spaces so total character is 15 including spaces