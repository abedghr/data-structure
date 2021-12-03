public class StackMain {
    public static void main(String[] args) {
        
        System.out.println("Hello Stack");
        int size = 5;
        System.out.println("Stack Size is " + size);
        MyStack stack = new MyStack(size);
        stack.push(0);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        System.out.println("Stack After Push " + size + " Elements");
        stack.printStack();

        System.out.println("Message When push element to full Stack");
        stack.push(5);
        stack.printStack();

        System.out.println("Stack After Remove Element from it");
        stack.pop();
        stack.printStack();
        
        System.out.println("return The Top element In the stack without remove it");
        System.out.println(stack.peeck());


        System.out.println("Stack List");
        stack.printStack();
        System.out.println("Stack After Remove 4 elements from it");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();

        System.out.println("Message When Remove Element From Empty Stack");
        stack.pop();
        stack.pop();
    }
}
