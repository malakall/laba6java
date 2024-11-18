public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10); // Создание стека с вместимостью 10
        stack.push(1); // Добавляем элемент 1
        stack.push(2); // Добавляем элемент 2
        stack.push(3); // Добавляем элемент 3
        
        System.out.println(stack.pop()); // Удаляем и выводим верхний элемент: 3
        System.out.println(stack.peek()); // Получаем верхний элемент без удаления: 2
        stack.push(4); // Добавляем элемент 4
        System.out.println(stack.pop()); // Удаляем и выводим верхний элемент: 4
    }
}
