class BoxColour extends BoxWeight{
    // Hierarchial Inheritance exampale
    String colString; 

    public BoxColour() {

        super();
        this.colString = "red";

    }

    public BoxColour(double l, double h, double w, double weight, String colString){
        super(l,h,w,weight);
        this.colString = colString;
    }
    
}