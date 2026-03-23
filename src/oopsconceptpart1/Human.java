package oopsconceptpart1;

public class Human {

        int age;
        int salary;
        String name;
        boolean married;
        static long population;

        static void message(){
            System.out.println("praveen");
            //System.out.println(this.age);
            // you  cannot use there because it does not contain any reference
            //instance

        }

        public Human(int age,int salary,String name,boolean married){
            this.age=age;
            this.salary=salary;
            this.name=name;
            this.married=married;
            Human.population=+1;

        }


    }

