import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
        float n1 , n2;
        System.out.println("enter the first number");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextFloat();
        System.out.println("enter the second number");
       // Scanner scan = new Scanner(System.in);
        n2 = scan.nextFloat();
        System.out.print(n1);
        System.out.print(" and ");
        System.out.println(n2);
        String prompt = "enter 0 for sum, 1 for sub, 2 for mul, 3 for div";
        System.out.println(prompt);
        int input = scan.nextInt();

        switch (input) {
            case 0:
            System.out.println("adding these numbers");
            System.out.println("the result is ----->>> ");
            System.out.println(n1+n2);
            break;
            
            case 1:
            System.out.println("subtracting these numbers");
            System.out.println("the result is ----->>> ");
            System.out.println(n1-n2);
            break;

            case 2:
            System.out.println("multiplying these numbers");
            System.out.println("the result is ----->>> ");
            System.out.println(n1*n2);
            break;

            case 3:
            System.out.println("dividing these numbers");
            System.out.println("the result is ----->>> ");
            System.out.println(n1/n2);
            break;
           
            default:
            System.out.println("<<-----INVALID INPUT----->> ");
        
        }
    }
}