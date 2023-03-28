package com.muhammetkarakurt;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.add("Kedi");
		stack.add("Kopek");
		stack.add("Aslan");
		stack.add("Kus");
		
		
		for (String string : stack) {
			System.out.println(string);
		}
		
		//LIFO uygulansi:
		
		//peek() stack e son giren elemani goster metodu
		
		System.out.println("\n -------- \n");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println();
		
		//pop() : stack e son giren elemani cikar metodu
		stack.pop();
		for (String string : stack) {
			System.out.println(string);
		}
		
		System.out.println();
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println();
		System.out.println(stack.peek());
		
		//isEmpty() : stack bosmu kontrolu
		
		System.out.println(stack.isEmpty());
		stack.pop();
		stack.pop();
		System.out.println(stack.isEmpty());
		//stack.pop(); stack bos ise pop yaparsan exception verir
	}

}
