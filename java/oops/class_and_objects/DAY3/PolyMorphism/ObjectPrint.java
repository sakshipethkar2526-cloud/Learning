class ObjectPrint { // every class extends object class no need to add this extends Object

   int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString(){
        return "ObjectPrint{" +
        "num = " + num + "}";

    }

    // We can also use final keyword to Prevent overridding. we can not override final method.....

   public static void main(String[] args) {
       ObjectPrint obj = new ObjectPrint(7);

       System.out.println(obj); ///I am trying to print object this will gives me hashcode but let's consider if I want num var value ?????
       //It is possible if we are passing the toString method of the class

       System.out.println(obj);  // Now this is Printing the num value as we have define our own toSTring
   }

}