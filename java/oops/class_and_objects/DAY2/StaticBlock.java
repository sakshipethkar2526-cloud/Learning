
// Let's see here how the static block runs
class StaticBlock{
    static int a = 4;
    static int b;
    

    //will run only once, when the first object is created i.e when the class is loaded 
    static{
        System.out.println(" I am running");
        b = a*4;
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        b += 3;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock sb2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }

}