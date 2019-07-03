package data_structure;

import java.util.Arrays;

public class stack{
	static int top=-1;//top of an stack
	int element;
	static int size=5;
	static int[] Stack=new int[size];//Declaring of an array
	static void push(int element) {//method to insert a element in stack
		if(isFull()) {//checking either the stack is full or not
			System.out.println("Stack is full");
		}
		else {
		 	top++;//increasing top so top points next location
			Stack[top]=element;//storing element to new location top
		}
		
	}
	static boolean isFull() {//checking either code is full or not
		if(top==size-1) {//top position should not be equal to the maximum of size-1
			return true;
		}
		else {
			return false;
		}
	}
	static void pop() {//method to pop or delete the element 
		if(isEmpty()) {//checking the stack is empty or not
			System.out.println("Stack is empty");
		}
		else {
			Stack[top]=0;//top element is equalized to 0
			top--;//decreasing top 
			
		}
	}
	static boolean isEmpty() {//checking is the stack is empty
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
		}
		 static void traverse() {//used to print the elements in stack 
				System.out.println(Arrays.toString(Stack));//arrays. function is found in util.arrays so you need to import it
			
		}
	static void peek() {//use this method to peek or show the top element 
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
		System.out.println(Stack[top]);
		}
	}
	
	public static void main(String []args) {
		traverse();
		peek();
		pop();
		push(3);
		push(5);
		push(23);
		push(2);
		push(9);
		push(10);
		traverse();
		pop();
		traverse();
		peek();
	}
}

