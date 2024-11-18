
public class Stack<T> {
    private T[] data; // Массив для хранения элементов стека
    private int size; // Текущий размер стека

    // Конструктор с заданной вместимостью
    public Stack(int capacity) {
        data = (T[]) new Object[capacity]; // Создание массива объектов
        size = 0; // Начальный размер стека равен 0
    }

    // Метод для добавления элемента в стек
    public void push(T element) {
        if (size == data.length) {
            throw new StackOverflowError("Стек переполнен");
        }
        data[size] = element; // Добавляем элемент в массив
        size++; // Увеличиваем размер стека
    }

    // Метод для удаления элемента из стека
    public T pop() {
        if (size == 0) {
            throw new IllegalStateException("Стек пуст");
        }
        size--; // Уменьшаем размер стека
        T element = data[size]; // Получаем верхний элемент
        data[size] = null; // Удаляем ссылку на элемент для GC
        return element; // Возвращаем удаленный элемент
    }

    // Метод для получения верхнего элемента стека без его удаления
    public T peek() {
        if (size == 0) {
            throw new IllegalStateException("Стек пуст");
        }
        return data[size - 1]; // Возвращаем верхний элемент
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return size == 0;
    }

    // Метод для получения текущего размера стека
    public int getSize() {
        return size;
    }
}
