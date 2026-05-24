class Box{
    private double l;
    double w;
    double h;

    // @Override we can't override static method
    static void greeting(){
      System.out.println("I am in box class");
    }

    public double getL(){
        return l;
    }


    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double w, double h){
        this.h = h;
        this.w = w;
        this.l = l;
    }

    Box(Box s){
       this.l = s.l;
       this.w = s.w;
       this.h = s.h; 
    }

    public void information(){
        System.out.println("Running the box");
    }
}