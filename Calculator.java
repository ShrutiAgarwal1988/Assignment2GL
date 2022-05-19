
import java.util.Scanner;
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
int a,b;
int res=0;
System.out.println("enter first number");
a=obj.nextInt();
System.out.println("enter second number");
b=obj.nextInt();
System.out.println("enter option");
int ch=obj.nextInt();
switch(ch)

{
case 1:
	res=a+b;
	System.out.println(res);
	break;
case 2:
	res=a-b;
	System.out.println(res);
	break;
case 3: 
	res=a*b;
	System.out.println(res);
	break;
case 4:
	if(b==0)
	{
		System.out.println("cannot be divided");
		break;
	}
	else
	{
	res=a/b;
	System.out.println(res);
	break;
	}
	default:
		System.out.println("option not present");
}

	}

}
