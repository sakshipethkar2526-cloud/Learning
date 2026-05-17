class StudentClass {

  int rollNo; //default value is 0
  String name; // default null
  int marks;

  //both implementation of constructor it is called constructor overloading.

  
    StudentClass(int rollNo, String name, int marks) {
      this.rollNo = rollNo;  // we need one word to access every object
      this.name = name;
       this.marks = marks;
      // Key point here we are using this keyword that's here it is working correct 
      // Bcz we can see the arguments and the var of the class are same so to differentiate we are using this keyword
      // if we are not using this keyword rollNo = rollNo it will return 0.
    }


    // copy constructor
    StudentClass( StudentClass s){
      this.rollNo = s.rollNo;
      this.name = s.name;
      this.marks = s.marks;
    }

    StudentClass(){
      // this is how we can call one constructor from another constructor
      this(1, "Default Name", 100); // it will call the parameterized
    }

    void greet() {
      System.out.println("Hello " + name);
    }
  

  public static void main(String[] args) {
    StudentClass kunal = new StudentClass(); // creating object of class
    // kunal is reference variable and it is pointing to the object of class StudentClass
    kunal.greet(); //print null

    // assigning values to the properties of the object using dot operator 1st option
    kunal.rollNo = 1;
    kunal.name = "Kunal";
    kunal.marks = 90;

    System.out.println(kunal.rollNo);
    System.out.println(kunal.name);
    System.out.println(kunal.marks);

   kunal.greet(); //print Hello Kunal

    // 2nd option to assign values to the properties of the object using constructor
    StudentClass rahul = new StudentClass(2, "Rahul", 85); //binds these arguments to the object

    System.out.println(rahul.rollNo);
    System.out.println(rahul.name);
    System.out.println(rahul.marks);


    StudentClass rohan = new StudentClass(rahul); // copy constructor
    System.out.println(rohan.rollNo);
    System.out.println(rohan.name);
    System.out.println(rohan.marks);


    StudentClass stud1 = new StudentClass();
    StudentClass stud2 = stud1; // stud2 is reference variable and it is pointing to the same object as stud1

    stud1.name = "Stud1";
    System.out.println(stud2.name); // Stud1

  }
}
