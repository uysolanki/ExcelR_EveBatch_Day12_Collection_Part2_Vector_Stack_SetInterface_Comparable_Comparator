package day11.collection;

import java.util.Stack;

public class StackParenthesis {

	static Stack<Character> stack=new Stack();
	
	static boolean validate(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(ch=='{' ||ch=='(' ||ch=='[')
			{
				stack.push(ch);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char p;
			switch(ch)
			{
			case ']' :	p=stack.pop();
						if(p=='{' || p=='(')
							return false;
						break;
			
			case '}' :	p=stack.pop();
						if(p=='[' || p=='(')
						return false;
						break;
						
			case ')' :	p=stack.pop();
						if(p=='[' || p=='{')
						return false;
						break;
			}
			
		}
		return(stack.isEmpty());
	}
}
