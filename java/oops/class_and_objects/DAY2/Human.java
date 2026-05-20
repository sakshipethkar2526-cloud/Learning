public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population; //for all it is same

    static String message(){
    //   System.out.print(this.age);  we can't as this is object 
      return "My message";
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // this.population = +1; without static declartion of population keyword with will give us 1 every time
        // as kunal.population will be 0 so we will do 0 + 1 = 1 
        // so when we will declare this to static we should be able to persist the value and we will not be depending upon object will be depend on Class
        Human.population += 1;
        message(); // without Class name also I can access this property
    }
}