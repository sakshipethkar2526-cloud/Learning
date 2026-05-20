
// What is . ----> It binds the instance variable and methods with the reference variable.


class InnnerClassClass{ // outside class which means outmost one can not be static
    // why ? It is not dependend itself on other class 
     
    //class inside class
    static class Test{ // This can be static why ? this depends on outside class

       String name;

       Test(String name){
        this.name = name;
       }

    }   

       public static void main(String[] args) {
        //    Test a = new Test("kunal"); 
        //    Test b = new Test("Rahul");

        //    System.out.println(a.name);
        //    System.out.println(b.name);


         // Above code will throw the error error: non-static variable this cannot be referenced from a static context
          // Test a = new Test("kunal"); 
          // As Test class is depends on the InnerClass even if you create a object of Test InnerClass object is needed so that's why inner class is static.

          //After Adding Static

           Test a = new Test("kunal"); 
           Test b = new Test("Rahul");

           System.out.println(a.name);
           System.out.println(b.name);


       }


    }


class Test {
    static String name;

    Test(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        Test t = new Test("Kunal");
        Test t2 = new Test("Rahul");

        System.out.println(t.name); // THis will Print Rahul
        System.out.println(t2.name); // This will also Rahul

        //Because we have declared the name as Static so it is depends on class not object 

        // Step:
//         new Test("Kunal")
// constructor runs
// this.name = "Kunal"
// static name becomes "Kunal"
// new Test("Rahul")
// constructor runs again
// this.name = "Rahul"
// same static variable is overwritten
    }
}