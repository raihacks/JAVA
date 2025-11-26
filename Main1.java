import java.util.Scanner;
public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result;
        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();


        System.out.printf("Enter an aperator (+, -, *, /, ^): ");
        operator = sc.next().charAt(0);

        System.out.println("Enter the Second number: ");
        num2 = sc.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '^' -> result = Math.pow(num1, num2);
            default -> System.out.println("enter the correct operator");
        }

        System.out.println(result);

        sc.close();
    }
}

public class Main1{
    public static void main(String[] args){
    }
}