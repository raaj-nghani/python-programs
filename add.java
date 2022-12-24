import java.util.Scanner;
class add{
    public static void main(String[] args) {
        
        System.out.println("Adding two numbers");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = s.nextInt();
        System.out.println("Enter second Number");
        int b = s.nextInt();
        int c = a+b;
        System.out.println("Sum of a & b is : " + c);
        System.out.println("Thank You....");
         
    }
}
