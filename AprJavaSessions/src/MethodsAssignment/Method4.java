package MethodsAssignment;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method4 obj=new Method4();
		int max=obj.Maximum(20, 10, 30);
		System.out.println(max);
		int min=obj.Minimum(40, 30, 60);
		System.out.println(min);
		

	}
	public int Maximum(int x,int y,int z) {
		if(x>y && x>z) {
			System.out.println("x is the maximum number:");
			return x;
			
		}
		else if(y>z) {
			System.out.println("y is the maximum number:");
			return y;
			
		}
		else
		{
			System.out.println("z is the maximum number:");
			return z;
		}
	}
	public int Minimum(int x,int y,int z) {
		if(x<y && x<z) {
			System.out.println("x is the minimum number:");
			return x;
			
		}
		else if(y<z) {
			System.out.println("y is the minimum number:");
			return y;
			
		}
		else
		{
			System.out.println("z is the minimum number:");
			return z;
		}
	}

}
