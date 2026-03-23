package oopsconceptpart1;

public class main {
    public static void main(String[] args) {
//        Human praveen=new Human(22,90000,"praveen",false);
//        Human dinesh=new Human(23,9000,"siva",false);
//        System.out.println(praveen.salary);
//        System.out.println(dinesh.age);
//        System.out.println(praveen.population);//not using this convension
//        System.out.println(Human.population);

      //  greeting();

    }
    // this is not depend on object
    static void fun(){
       // greeting();// you cant use this because it requries as an instance
        //but the func you are using it in does  not depend on instance


        // you cannot access non static stuff without referencing their istamce
        //in a static context

        // hence,here referencing it
        main obj=new main();
        obj.greeting();
    }
    // we know that something which is not static ,it belongs to an object
    void greeting(){
       // fun();
        System.out.println("hello");
    }
}
