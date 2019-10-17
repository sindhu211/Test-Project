package MethodsAssignment;

public class Method5 {
	public static void main(String[] args) {
		Method5 obj=new Method5();
		int num=obj.find(6);
		System.out.println(num);
}
	public int find(int num) {
		if (num%2==0) {
			System.out.println("Even number:");
			
		}
		else {
			System.out.println("odd number:");
			
		}
		return num;
	}
}
