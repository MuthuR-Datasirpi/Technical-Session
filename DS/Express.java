

import java.util.*;

public class Express {

	
	public static boolean value(String s) {
		Stack<Character> stack=new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			
			char ch=s.charAt(i);
			if(ch=='('|| ch=='{'||ch=='[') {
					stack.push(ch);
				
			}
			else if(stack.isEmpty()) {
			    return false;
			}
			else if(ch==')' && stack.peek()=='(') {
					stack.pop();
				
			}
			else if(ch=='}' && stack.peek()=='{') {
				stack.pop();
			
		}
			else if(ch==']' && stack.peek()=='[') {
				stack.pop();
			
		}
			
			else {
				return false;
			}
						
		}
		
		
		
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Experssion");
		String Brack=sc.next();
		
		if(value(Brack)){
			System.out.println("Expression is valid");
		}
		else {
			System.out.println("Expression is not valid");
		}
	
	
}

	
}