package MethodsAssignment;

public class Method9 {
	public static void main(String[] args) {
		Method9 obj=new Method9();
		int p=obj.fact(5);
		System.out.println(p);
}
	public int fact(int x) {
		int prod=1;
		for(int i=1;i<=x;i++) {
			prod=prod*i;
		}
		return prod;
	}
}