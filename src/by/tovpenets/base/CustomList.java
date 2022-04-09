package by.tovpenets.base;

/*
    Предусмотреть операции:
    - добавления элемента;
    - удаления элемента;
    - получение элемента по индексу;
    - проверка есть ли элемент в коллекции;
    - метод очистки все коллекции.
*/
public interface CustomList<E> {

    void add(E value);

    void remove(int index);

    E get(int index);

    boolean contains(E value);

    void clear();

    void printElements();

}