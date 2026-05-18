package ornek10;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Calistir {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Kamile");
		stack.push("Husumet");
		stack.push("Lalezar");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.addFirst("1"); // kullanmayın
		stack.get(0); // kullanmayın
		Deque<String> queue = new ArrayDeque<String>();
		// queue.pop()
		queue.push("Ali");
		queue.addFirst("Veli");
		queue.addLast("Zeynep");
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		System.out.println(queue.pollFirst());
		System.out.println(queue.pollLast());
		System.out.println(queue.pollLast());

	}
}
