public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(1); 
        stack.push(2); 
        stack.push(3); 
        System.out.println("размер стека : " + stack.getSize());
        
        System.out.println("удаляем и выводим верхний эл-т : " + stack.pop()); 
        System.out.println("получаем верхний эл-т : " + stack.peek());
        stack.push(4);
        System.out.println("удаляем и выводим верхний эл-т : " + stack.pop());
    }
}
