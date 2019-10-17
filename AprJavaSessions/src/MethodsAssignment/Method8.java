package MethodsAssignment;

public class Method8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method8 obj=new Method8();
		int marks=obj.getStudentMarks(98);
		System.out.println(marks);
	}
	public int getStudentMarks(int x) {
		if(x>=91 && x<=100) {
			System.out.println("Grade is:AA");
		}
		else if(x>=81 && x<=90) {
			System.out.println("Grade is:AB");
		}
		else if(x>=71 && x<=80) {
			System.out.println("Grade is:AB");
		}
		else if(x>=61 && x<=70) {
			System.out.println("Grade is:BC");
		}
		else if(x>=51 && x<=60) {
			System.out.println("Grade is:CD");
		}
		else if(x>=41 && x<=50) {
			System.out.println("Grade is:DD");
		}
		else if(x<=40) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Not defined");
		}
		return x;
	}

}
