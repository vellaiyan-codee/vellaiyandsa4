package oops6;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        comparision praveen=new comparision(10,80.55f);
        comparision vicky=new comparision(29,87.57f);
        comparision ganesh=new comparision(5,35.58f);
        comparision dinesh=new comparision(44,60.67f);

        comparision[] list={praveen,vicky,ganesh,dinesh};
        System.out.println(Arrays.toString(list));

        //sort method
//        Arrays.sort(list);
//        System.out.println(Arrays.toString(list));




        if (praveen.compareTo(vicky)<0){
            System.out.println(praveen.compareTo(vicky));
            System.out.println("vicky got more marks");
        }
        }


    }

