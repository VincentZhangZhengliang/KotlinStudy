package genericType.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Package:genericType.java
 * User:Vincent
 * Date:2017/11/21 9:55
 * Dsc:
 */
public class Test01 {


    public static void main(String[] args) {


        List<? extends Animal> animals = new ArrayList<>();

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        animals = dogs;


        for (int i = 0; i < animals.size(); i++) {

            System.out.println(animals.get(i).hashCode());
        }

        List<? extends Number> list1 = new ArrayList<Integer>();
        List<? extends Number> list2 = new ArrayList<Float>();


        List<? super Number> list3 = new ArrayList<Number>();
        List<? super Number> list4 = new ArrayList<Object>();

        list3.add(1);





    }


}
