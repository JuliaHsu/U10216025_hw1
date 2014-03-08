import java.util.Scanner;
public class TestFunction {
	public static void main (String args[]){
	System.out.println("Enter x  \n ");
	Scanner input = new Scanner(System.in);
	double x = input.nextDouble();
	Function1 a = new Function1();
	System.out.println("f(x) = x^2 = " + a.f(x));
	Function2 b = new Function2();
	System.out.println("f(x) = sin(x) =  " + b.f(x));
	Function3 c = new Function3();
	System.out.println("f(x) = cos(x) =  " + c.f(x));
	Function4 d = new Function4();
	System.out.println("f(x) = tan(x) =  " + d.f(x));
	Function5 e = new Function5();
	System.out.println("f(x) = cos(x) + 5sin(x) =  " + e.f(x));
	Function6 f = new Function6();
	System.out.println("f(x) = 5cos(x) + sin(x) = " + f.f(x));
	Function7 g = new Function7();
	System.out.println("f(x) = log(x) + x^2 =  " + g.f(x));
	}
}	

