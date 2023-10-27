import java.util.Scanner;
public class QuadraticRunner
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the quadratic expression you'd like to factor.");
        System.out.print("Enter it in the form ax^2+bx+c: ");
        String eqn = s.nextLine();
        int a = Integer.parseInt(eqn.substring(0,eqn.indexOf("x^2")));
        System.out.println("a = "+a);
        int b = Integer.parseInt(eqn.substring(eqn.indexOf("+")+1, eqn.indexOf("x+")));
        System.out.println("b = "+b);
        int c = Integer.parseInt(eqn.substring(eqn.indexOf("x+")+2));
        System.out.println("c = "+c);
    }
}
