package MethodsAssignment;

public class Method6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method6 vote=new Method6();
		int v=vote.vote(67);
		System.out.println(v);
		
	}
public int vote(int age) {
	if(age>=18) {
		System.out.println("He/She eligible for vote:");
	}
	else {
		System.out.println("He/She not eligible for vote:");
	}
	return age;
}
}
