package genericType.java;

import java.util.Arrays;

/**
 * Package:genericType.java
 * User:Vincent
 * Date:2017/11/21 9:08
 * Dsc:
 */
public class RawArrayList {

    public int length = 0;
    private Object[] elements;

    public RawArrayList(int length) {
        this.length = length;
        this.elements = new Object[length];
    }

    public Object get(int index) {
        return this.elements[index];
    }

    public void add(int index, Object element) {

        this.elements[index] = element;

    }


    @Override
    public String toString() {
        return "RawArrayList{" +
                "length=" + length +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
