// This class includes wrapper class and finalize implementation

public class WrapperExample {

    static void swap(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
    }

    static void swap2(Integer a, Integer b) {
            Integer temp = a;
            a = b;
            b = temp;
    }

    String name;

    public WrapperExample(String name) {
        this.name = name;
    }


    @Override
    protected void finalize() throws Throwable {
      System.out.println("Object is getting distroyed");
    };
    


    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        Integer num = 10; // object of wrapper class
        swap(a, b);
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Here the values of a and b will not change because we are passing the values of a and b to the swap method, 
        // not the reference of a and b. So, the swap method will only swap the values of a and b inside the method, 
        // but it will not affect the values of a and b in the main method.

        //To swap actual
        Integer num1 = 10;
        Integer num2 = 20;
        Integer temp = num1;
        num1 = num2; // we are changing the reference of num1 to num2 we are changing it to point to the same object as num2
        num2 = temp;
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        //with swap2 methhod
        Integer f = 89;
        Integer g = 90;
        swap2(f, g);

        System.out.println("f: " + f); // this is not working because we are passing the reference of f and g to the swap2 method, but we are not changing the reference of f and g inside the swap2 method, we are only changing the reference of a and b inside the swap2 method, so it will not affect the reference of f and g in the main method.
        System.out.println("g: " + g);


        //Let's talk about final keyword in java
        final int x = 10; // we cannot change the value of x because it is final
        // x = 20; // this will give error because we cannot change the value

        // final object

        final WrapperExample obj = new WrapperExample("Alice"); // we cannot change the reference of obj because it is final


        System.out.println(obj); // this will print ClassName@hash





        System.out.println(obj.name); // we can change the properties of the object but we cannot change the reference of the object
        obj.name = "Bob"; // this is allowed because we are changing the property of the object, not the reference of the object
        System.out.println(obj.name);

        // but if we try to change the reference of obj it will give error
        // when a non-Primitive is final, you cannot reassign it
        // obj = new WrapperExample("Charlie"); // this will give error because we cannot change

        //Let's learn about finalize
        WrapperExample obj2;

       for(int i=0; i< 1000000000; i++){ // with small count this won't call as memory is capable to handle this load.
        obj2 = new WrapperExample("Creating more object in heap");
       }

    }

}