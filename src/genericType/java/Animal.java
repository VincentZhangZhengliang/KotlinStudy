package genericType.java;

import java.util.List;

/**
 * Package:genericType.java
 * User:Vincent
 * Date:2017/11/21 9:23
 * Dsc:
 */
public class Animal {

    public void act(List<? extends Animal> list) {

        for (Animal animal : list) {
            animal.eat();
        }

    }


    public void aboutShepherDog(List<? super ShepherdDog> list) {
        System.out.println("About ShepherdDog");
    }


    public void eat() {

        System.out.println("Eating");
    }



}

class Dog extends Animal {
}

class Cat extends Animal {
}


class ShepherdDog extends Dog {
}
