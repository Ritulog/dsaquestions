package statck.n.quueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack1 = new  CustomStack(5);
        CustomStack stack = new DynamicStack(5);


        stack1.push(34);
        stack1.push(45);
        stack1.push(2);
        stack1.push(9);
        stack1.push(18);


        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(89);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}