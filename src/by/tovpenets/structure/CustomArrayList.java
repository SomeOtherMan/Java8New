package by.tovpenets.structure;

import by.tovpenets.base.CustomList;

import java.util.Arrays;

public class CustomArrayList<E> implements CustomList<E> {

    private static final byte DEFAULT_CAPACITY = 10;

    private int elementCounter = 0;

    private Object[] elementData;

    public CustomArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public void add(E value) {
        elementCounter++;
        if (elementCounter == elementData.length)
            elementData = Arrays.copyOf(elementData, (int)(elementData.length * 1.5 + 1));
        elementData[elementCounter - 1] = value;
    }

    @Override
    public void remove(int index) {
        elementData[index] = null;
    }

    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public boolean contains(E value) {
        return Arrays.asList(elementData).contains(value);
    }

    @Override
    public void clear() {
        elementData = null;
    }

    @Override
    public void printElements() {
        Arrays.stream(elementData).forEach(System.out::println);
    }
}