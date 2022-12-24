import java.util.Scanner;
class calculator{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int choice, a, b, c;
	System.out.println("Enter your choice: \n 1: + \n 2: - \n 3: * \n 4: / \n 5: %");
	choice = s.nextInt();
	switch(choice){
	case 1:
		System.out.println("Enter first number");
		a = s.nextInt();
		System.out.println("Enter Second Number");
		b = s.nextInt();
		c= a+b;
		System.out.println("Sum of a & b is : " + c);
		break;
	case 2:
		System.out.println("Enter first number");
		a = s.nextInt();
		System.out.println("Enter Second Number");
		b = s.nextInt();
		c= a-b;
		System.out.println("Sum of a & b is : " + c);
		break;
	case 3:
		System.out.println("Enter first number");
		a = s.nextInt();
		System.out.println("Enter Second Number");
		b = s.nextInt();
		c= a*b;
		System.out.println("Sum of a & b is : " + c);
		break;
	case 4:
		System.out.println("Enter first number");
		a = s.nextInt();
		System.out.println("Enter Second Number");
		b = s.nextInt();
		c= a/b;
		System.out.println("Sum of a & b is : " + c);
		break;
	case 5:
		System.out.println("Enter first number");
		a = s.nextInt();
		System.out.println("Enter Second Number");
		b = s.nextInt();
		c= a%b;
		System.out.println("Sum of a & b is : " + c);
		break;
	default:
		System.out.println("Wrong choice... ");
		break;
		}
	}
}
