package DSA.ArrayListAndLinkedList;

import java.util.Arrays;

public class Mylist {
    public static class MyList<E> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private Object elements[];

        public MyList() {
            elements = new Object[DEFAULT_CAPACITY];
        }
        private void ensureCapa() {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
    }
    public void add(int i, E e) {
            if (size == elements.length) {
                ensureCapa();
            }
            elements[size++] = e;
        }
        public E get(int i) {
            if (i>= size || i <0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i + "CHỊU!                    >''<"+"                    "+"ĐÉO LÀM ĐƯỢC");
            }
            return (E) elements[i];
        }


        public void add1(E i) {
            System.out.println("clgt????");
        }

        public void print() {
            System.out.println("chua hieu bai lam >< ");
        }
    }

}
