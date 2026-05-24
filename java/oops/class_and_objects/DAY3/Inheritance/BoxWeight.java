class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight){
        super(l,w,h);
        // what is this ??
        // l,w,h is defined in parent class we wanted to use it is child class so to use parent constructor in child we will use this super()
        // we needs this construtor in parent class
        this.weight = weight;
         // super(l,w,h); if we change this sequenece we will get error bcz parent class is not aware about the children propertied
    }


    BoxWeight(BoxWeight other){
      super(other); // how this workinh other is of BoxWeight type and how can we pass bcz other is of BoxWeight type which is child of parent class so child contains parent properties as well so that's why even if the other is BoxWeight type it will be passed to parent class as Box type only.........
      weight = other.weight;

    }


    // @Override we can't override static method
    static void greeting(){
      System.out.println("I am in box class");
    }

    
}