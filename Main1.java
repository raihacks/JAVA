import java.util.Scanner;
// public class Main1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         double num1;
//         double num2;
//         char operator;
//         double result;
//         System.out.println("Enter the first number: ");
//         num1 = sc.nextDouble();
//         System.out.printf("Enter an aperator (+, -, *, /, ^): ");
//         operator = sc.next().charAt(0);
//         System.out.println("Enter the Second number: ");
//         num2 = sc.nextDouble();
//         switch(operator){
//             case '+' -> result = num1 + num2;
//             case '-' -> result = num1 - num2;
//             case '*' -> result = num1 * num2;
//             case '/' -> result = num1 / num2;
//             case '^' -> result = Math.pow(num1, num2);
//             default -> System.out.println("enter the correct operator");
//         }
//         System.out.println(result);
//         sc.close();
//     }
// }

// public class Main1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String username;
//         System.out.println("Enter your username:");
//         username = sc.nextLine();
//         if (username.length() < 4 || username.length() > 12 ){
//             System.out.println("Username must be bhetween 4-12 characters.");
//         }
//         else if(username.contains(" ") || username.contains("_")){
//             System.out.println("Username must not contain space or '_'.");
//         }
//         else{
//             System.out.println("Welcome " + username);
//         }
//     }
// }

public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String name = "siddhi";
        // while(name.isEmpty()){
        //     System.out.print("Enter your name: ");
        //     name = sc.nextLine();
        // }
        // System.out.println("Hello "+name);
        // sc.close();
        // while(1 == 1){
        //     System.out.println("help!! its a loop!");
        // }

        // String response = "";
        // while(!response.equals("Q")){
        //     System.out.println("You are playing the game");
        //     System.out.println("Press Q to quit: ");
        //     response = sc.next().toUpperCase();
        // }
        // System.out.println("You have quit playing the game");
        int age = 0;
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        do{
            System.out.println("ur not bron yet");
            System.out.print("Enter your age: ");
            age = sc.nextInt();
        }while(age < 0);
        System.out.println("You are "+age+" years old.");
    }
}