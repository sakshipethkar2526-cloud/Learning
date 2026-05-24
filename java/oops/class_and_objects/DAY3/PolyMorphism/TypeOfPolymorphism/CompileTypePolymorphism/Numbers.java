

public class Numbers{
    //Method Overloading
    int sum(int a, int b){
     return a+b;
    };

    void sum(int a, String b){
        System.err.println(a+ "" + b);

    }

    int sum (int a, int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();

        num.sum(10, 7);
        num.sum(8,2,9);

    }
}