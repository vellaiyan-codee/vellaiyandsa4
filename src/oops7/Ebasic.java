package oops7;

public class Ebasic {
    enum week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
        // these are called as enum  constants
         // public ,static and final
        // since its final you can create child enums
        //  and the type is "week"
    }

    public static void main(String[] args) {
        week week;
        week= Ebasic.week.Monday;

        for (week day: week.values()) {
            System.out.println(day);
            System.out.println(week.ordinal()  );


        }
    }
}
