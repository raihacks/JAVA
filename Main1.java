import java.util.Scanner;
import java.util.Random;
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

// public class Main1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
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
//         int age = 0;
//         System.out.print("Enter your age: ");
//         age = sc.nextInt();
//         do{
//             System.out.println("ur not bron yet");
//             System.out.print("Enter your age: ");
//             age = sc.nextInt();
//         }while(age < 0);
//         System.out.println("You are "+age+" years old.");
//     }
// }

//public class Main1{
    //public static void main(String[] args){
        // Random random = new Random();
        // Scanner sc = new Scanner(System.in);
        // int guess;
        // int attempts = 0;
        // int min = 1;
        // int max = 100;
        // int randomNum = random.nextInt(min,max+1);
        //System.out.println(randomNum);
        // System.out.println("Number guessing game");
        // System.out.printf("Guess a number between %d-%d", min, max);
        // do{
        //     System.out.println("Enter a guess: ");
        //     guess = sc.nextInt(); 
        //     attempts ++;
        //     if(guess<randomNum){
        //         System.out.println("too low! try again");
        //     }
        //     else if(guess>randomNum){
        //         System.out.println("too high! try again");
        //     }
        //     else{
        //         System.out.println("Correct! The number was "+ randomNum);
        //         System.out.println("# of attempts "+ attempts);
        //     }
        // }while(guess != randomNum);
        //System.out.println("you hvae won");
    //}
//}

// public class Main1{
//     public static void main(String[] args) throws InterruptedException {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("How many seconds to countdown from? ");
//         int start = sc.nextInt();
//         for(int i = start; i>0; i--){
//             System.out.println(i);
//             Thread.sleep(1000);
//         }
//         System.out.println("happy new year");
//     }
// }

// public class Main1{
//     public static void main(String[] args){
//         for(int i = 0; i <10; i++){
//             if(i == 5){
//                 //break;
//                 continue;
//             }
//             System.out.print(i + " ");
//         }
//     }
// }

// public class Main1{
//     public static void main(String[] args){
        // for(int i = 1; i <= 3; i++){
        //     for(int j = 1; j <= 9; j++){
        //         System.out.print(j + " ");
        //     }
        // }
//         Scanner sc = new Scanner(System.in);
//         int rows;
//         int columns;
//         char symbol;
//         System.out.println("Enter the # of rows: ");
//         rows = sc.nextInt();
//         System.out.println("Enter the # of columns: ");
//         columns = sc.nextInt();
//         System.out.println("Enter the symbol to be printed: ");
//         symbol = sc.next().charAt(0);
//         for(int i = 0;i < rows; i++){
//             for(int j = 0;j < columns; j++){
//                 System.out.print(symbol);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Main1{
//     public static void main(String[] args){
        // String name = "Bro";
        // int age = 12;
        // happyBirthday(name, age);
        // happyBirthday(name, age);
        // happyBirthday(name, age);
        // double result = square(9);
        // System.out.println(result);
//     }
//     static void happyBirthday(String name,int age){
//         System.out.println("Happy birthday to you!");
//         System.out.println("Happy birthday to you!");
//         System.out.printf("Happy birthday dear, %s!" ,name);
//         System.out.println("Happy birthday to you!");
//         System.out.printf("Youe'r %d years old.\n" ,age);
//     }
//     static double square(double number){
//         return number * number;
//     }
// }

// public class Main1{
//     public static void main(String[] args){
//         System.out.println(agecheck(289));
//     }
//     static boolean agecheck(int age){
//         boolean isAdult = age >=18;
//         return isAdult;
//     }
// }

public class Main1{
    public static void main(String[] args){
        
    }
}

// public class Main1{
//     public static void main(String[] args){
        
//     }
// }