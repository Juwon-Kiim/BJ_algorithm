package Algo_D0214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Prob_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<>();
		
		String str = br.readLine();
		
		int a=0, b=0, c=0;
		
		
		
		for(int i=0;i<str.length();i++) {
			
			switch(str.charAt(i)) {
			case '*':
				a = stack.pop();
				b = stack.pop();
				c = b*a;
					
				stack.push(c);
				break;
			case '+':
				a = stack.pop();
				b = stack.pop();
				c = b+a;
					
				stack.push(c);
				break;
			case '-':
				a = stack.pop();
				b = stack.pop();
				c = b-a;
					
				stack.push(c);
				break;
			case '/':
				a = stack.pop();
				b = stack.pop();
				c = b/a;
					
				stack.push(c);
				break;
			default:
				stack.push(str.charAt(i)-'0');
				break;
			}
				
		}
		System.out.println(c);
		
	}
}
