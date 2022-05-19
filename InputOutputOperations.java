
import java.util.Scanner;

class InputOutputOperations{

	public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	int a=1;
	float b;
	boolean bool;
	double c;
char m;
	System.out.println("enter int value");
	a=obj.nextInt();
	System.out.println("integer value is---->"+a);
	System.out.println("enter float value");
	b=obj.nextFloat();

	System.out.println("float value is---->"+b);
	System.out.println("enter int boolean value");
	bool=obj.nextBoolean();
	System.out.println("boolean value is--->"+bool);
	System.out.println("enter int double value");
	c=obj.nextDouble();
	System.out.println("double value is---->"+c);
	String str;
	System.out.println("enter the string");
	str=obj.next();
	System.out.println("string is---->"+str);

	m=obj.next().charAt(0);
	System.out.println("character at 0 is"+m);
	
	}
	}
	


