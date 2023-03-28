package com.muhammetkarakurt;

import java.util.Stack;

public class StackSoru {

	public static boolean isValid(String s) {

		Stack<Character> solParentezStack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if( c == '(' || c == '[' || c == '{') 
			{
				solParentezStack.push(c);
			}
			else if ( c == ')' && solParentezStack.isEmpty() && solParentezStack.peek()== '(') 
			{
				solParentezStack.pop();
			}
			else if ( c == ']' && solParentezStack.isEmpty() && solParentezStack.peek()== '[') 
			{
				solParentezStack.pop();
			}
			else if ( c == '}' && solParentezStack.isEmpty() && solParentezStack.peek()== '{') 
			{
				solParentezStack.pop();
			}
			else
			{
				return false;
			}
		}
		return solParentezStack.isEmpty();      //  stack in bos olup olmadigini kontrol ediyoruz sola parantez kaldiysa false doner

	}

	public static void main(String[] args) {
		// Düzgün Parantezler Problemi
		/*
		 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
		 * ']', determine if the input string is valid.
		 * 
		 * An input string is valid if:
		 * 
		 * Open brackets must be closed by the same type of brackets. Open brackets must
		 * be closed in the correct order. Constraints : s consists of parentheses only
		 * '()[]{}'.
		 * 
		 * Example 1: Input: s = "()" Output: true
		 * 
		 * Example 2: Input: s = "()[]{}" Output: true
		 * 
		 * Example 3: Input: s = "(]" Output: false
		 * 
		 * Example 4: Input: s = "([)]" Output: false
		 * 
		 * Example 5: Input: s = "{[]}" Output: true
		 * 
		 * Note: In this question, we need to deal with only 6 symbols — (, ), {, }, [,
		 * ]. We will be given a string containing only these symbols.
		 */

	}

}
