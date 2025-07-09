package Stack;

import java.util.LinkedList;
import java.util.Stack;


//Stack extend Vector that so why Stack is also synchronized
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //Adding the element to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        //Retrieve the last element to the stack
        Integer s1 = stack.pop();
        System.out.println(s1);
        System.out.println(stack);

        //Find the peak means top element in the stack
        Integer peak = stack.peek();
        System.out.println(peak);
        System.out.println(stack);

        //Checking the stack is empty or not
        System.out.println(stack.isEmpty());

        //Check the size of the stack
        System.out.println(stack.size());

        //Find and search the element according to there number or value
        Integer search = stack.search(1);
        System.out.println(search);

        // Also we make Stack using LinkList
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println(list);
        Integer find = list.getLast(); //peak
        System.out.println(find);
        list.removeLast(); //pop
        System.out.println(list);
    }
}
