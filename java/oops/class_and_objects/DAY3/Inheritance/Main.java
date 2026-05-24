class Main {

   public static void main(String[] args) {
       Box b = new Box();
       System.out.println(b.l);

    BoxWeight bw = new BoxWeight();
    System.out.println(bw.l+" " +bw.weight);

    BoxWeight bw2 = new BoxWeight(3,9,6,10); //Now we have passed all 4 parameters 3 of super class and one from child class


    Box box1 = new BoxWeight(6,2,1,3); // (parents is refrencing to you.........)
    // what we have did here reference variable of super class and object initialization of child class
    // que will be able to access child properties now ??????????//
    // Ans::::::::::::::::::::Nooooooooooooo

    //System.out.println(box1.weight);

     BoxPrice bp = new BoxPrice();
     System.out.println(bp.l+" "+ bp.weight+" "+ bp.price + "Multilevel Inheritance example");

     b.greeting();

     Box b1 = new BoxWeight();

     b1.greeting(); // still here the Box greeting method is call bcz static method can't be override

     BoxWeight b2 = new BoxWeight();

     b2.greeting(); // Still here Box greeting method is call bcz static method can't be override

     // you can inherit but you cannot override....


     // Overrriding depends on object Static does not depends on object hence static method we can't override..............



   }
}