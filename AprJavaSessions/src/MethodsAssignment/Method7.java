package MethodsAssignment;

public class Method7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method7 obj=new Method7();
boolean prime=obj.isPrime(25);
System.out.println("number is prime:"+prime);

	}
public boolean isPrime(int n) {
	boolean prime=true;
	if(n>1) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
	}
	else {
		prime=false;
	}
	return prime;
}
}
