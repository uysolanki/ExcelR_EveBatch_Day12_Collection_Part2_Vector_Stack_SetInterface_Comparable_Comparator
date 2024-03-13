package day11.collection;

public class DriverApp {
public static void main(String[] args) {
	
	String expression="{[([))]}";
	if(expression.length()%2==1)
		System.out.println("Invalid Expression");
	else
		if(StackParenthesis.validate(expression))
			System.out.println("Valid Expression");
		else
			System.out.println("Invalid Expression");
}
}
