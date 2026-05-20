

class SingletonClasses{
    // Only one Instance of class (one object - 1 class)

    // To allow to creeate only one object we shouldn't call the construtor right let's make it private constructor

    private SingletonClasses(){

    } 

    private static SingletonClasses instance;

    public static SingletonClasses getInstance(){
        if(instance == null){
            instance = new SingletonClasses();
        }

       return instance;
    }


}


class Main{
    public static void main(String[] args) {
        SingletonClasses a1 = SingletonClasses.getInstance();
        SingletonClasses b1 = SingletonClasses.getInstance();

    }
}