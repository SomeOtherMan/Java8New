package by.tovpenets;

/*
    Дополнительное задание
    2. Представим, что в Java нет коллекции типа ArrayList.
    Создать свой класс, симулирующий работу класса динамической
    коллекции - т.е. создать свою кастомную коллекцию.
    В основе коллекции будет массив.
    Кастомная коллекция должна хранить элементы разных классов(т.е. это generic).
    Предусмотреть операции добавления элемента, удаления элемента,
    получение элемента по индексу, проверка есть ли элемент в коллекции,
    метод очистки все коллекции.
    Предусмотреть конструктор без параметров - создает массив размером по умолчанию.
    Предусмотреть конструктор с задаваемым размером внутреннего массива.
    Предусмотреть возможность автоматического расширения коллекции при
    добавлении элемента в том случае, когда коллекция уже заполнена.
*/


import by.tovpenets.base.CustomList;
import by.tovpenets.model.Client;
import by.tovpenets.structure.CustomArrayList;

public class Main {

    public static void main(String[] args) {

        CustomList<Client> list = new CustomArrayList<>();
        list.add(new Client("Ilya", (byte)10));
        list.add(new Client("Ilya", (byte)11));
        list.add(new Client("Ilya", (byte)12));
        list.add(new Client("Ilya", (byte)13));
        list.add(new Client("Ilya", (byte)14));
        list.add(new Client("Ilya", (byte)15));
        list.add(new Client("Ilya", (byte)16));
        list.add(new Client("Ilya", (byte)17));
        list.add(new Client("Ilya", (byte)18));
        list.add(new Client("Ilya", (byte)19));
        list.printElements();

        list.remove(2);
        list.printElements();

        System.out.println("Contains result is " + list.contains(new Client("Ilya", (byte) 14)));

        Client client = list.get(3);
        System.out.println(client);

        list.clear();

        list.printElements();
    }
}



