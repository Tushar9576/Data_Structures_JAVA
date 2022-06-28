import javax.management.Query;
import java.util.*;

public class Inbuiltexample {
    public static void main(String[] args) {
       Stack<Integer> stack = new Stack<>();
       stack.push(34);
       stack.push(33);
       stack.push(32);
       stack.push(31);
       stack.push(30);
       stack.push(29);
       System.out.println(stack);
       System.out.println(stack.pop());
       System.out.println(stack);
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());

       Queue<Integer> que = new LinkedList<>();
       que.add(3);
       que.add(6);
       que.add(5);
       que.add(19);
       que.add(1);
       System.out.println(que.remove());
       System.out.println(que);
       System.out.println(que.remove());
       System.out.println(que.remove());
       System.out.println(que.remove());
       System.out.println(que.remove());
       System.out.println(que.remove());
       Deque<Integer> deque = new ArrayDeque<>();
       deque.add(89);
       deque.addFirst(2);
       deque.addLast(69);
       deque.removeFirst();
       deque.removeLast();

    }
}
