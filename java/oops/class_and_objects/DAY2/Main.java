public class Main{

    int var1 = 10;

    public static void main(String[] args) {

        System.out.println(Human.population); // even before object creation we can access static var this proves that static var/method depends on the Class not on object
        // This will print 0 as the Int default value is 0
        Human kunal = new Human(22,"kunal", 10000, false);
        Human rahul = new Human(23,"Rahul", 17989, false);
        
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.message());
        // System.out.println(var1); (belongs to object as non-static)

        // greeting(); non-static method greeting() cannot be referenced from a static context (We have to object bcz it is non-static method)
        


    }

    static void fun(){
        Main n = new Main();
        n.greeting(); // In this way we can access
       // greeting(); this also not possible (without specific which instance belongs to you can not use it here)
    }


    void greeting(){
       fun(); // we can call static content here... 
       System.out.println("Hey I am not static"); 
    }

    

}