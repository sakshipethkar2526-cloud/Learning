class BoxPrice extends BoxWeight{

    float price;

    public BoxPrice(){
        super();
        this.price = -1;
    }

    public BoxPrice(double l, double h,double w, double weight, float price){
        super(l,h,w,weight);
        this.price = price;
    }

    public BoxPrice(BoxPrice Bp){
        super(Bp);
        this.price = Bp.price;
    }

}