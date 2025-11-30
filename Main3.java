import java.util.Scanner;
import java.util.Random;
// public class Main3{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         Random rn = new Random();
//         String[] choice ={"rock", "paper", "scissors"};
//         String compChoice;
//         String playAgain = "yes";
//         do{
//         System.out.println("Chosee between (rock/paper/scissors): ");
//         String playerChoice= sc.nextLine().toLowerCase();
//         if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
//             System.out.println("Invalid choice");
//             continue;
//         }
//         compChoice = choice[rn.nextInt(3)];
//         System.out.println("Computer Choice: "+compChoice);
//         if(playerChoice.equals(compChoice)){
//             System.out.println("It is a tie.");
//         }
//         else if((playerChoice.equals("rock") && compChoice.equals("scissors")) || (playerChoice.equals("scissors") && compChoice.equals("paper")) || (playerChoice.equals("paper") && compChoice.equals("rock"))){
//             System.out.println("U win.");
//         }
//         else{
//             System.out.println("U lose.");
//         }
//         System.out.println("Play again(Yes/no): ");
//         playAgain = sc.nextLine().toLowerCase();
//         }while(playAgain.equals("yes"));
//         System.out.println("Thank you for playing");
//     }
// }

// public class Main3{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int balance = 100;
//         int bet;
//         int payout;
//         String[] rows;
//         System.out.println("---------------------------");
//         System.out.println("Welcome to the slot machine");
//         System.out.println("Symbols: 🐶 🐣 🐒 🐗 🐸 ");
//         System.out.println("---------------------------");
//         while(balance > 0){
//             System.out.println("Current balance: "+balance);
//             System.out.println("Place your bet amount: ");
//             bet = sc.nextInt();
//             if(bet > balance){
//                 System.out.println("INSUFFICIENT FUNDS");
//                 continue;
//             }
//             else if(bet <= 0){
//                 System.out.println("Bet must be greater than 0");
//                 continue;
//             }
//             else{
//                 balance -= bet;
//                 System.out.println("Current balance: "+balance);
//             }
//             System.out.println("Spinning...");
//             rows = spinRow();
//             printRow(rows);
//             payout = getPayout(rows, bet);
//             if(payout > 0){
//                 System.out.println("you won " + payout);
//                 balance += payout;
//             }
//             else{
//                 System.out.println("you lost");
//             }
//         }
//     }
//     static String[] spinRow(){
//         String[] symbols = {"🐶", "🐣", "🐒", "🐗", "🐸"};
//         String[] row = new String[3];
//         Random rn = new Random();
//         for(int i =0; i < 3; i++){
//             row[i] = symbols[rn.nextInt(symbols.length)];
//         }
//         return row;
//     }
//     static void printRow(String[] rows){
//         System.out.println("---------");
//         System.out.println(" " + String.join("|", rows ));
//         System.out.println("---------");
//     }
//     static int getPayout(String[] rows, int bet){
//         if(rows[0].equals(rows[1]) && rows[1].equals(rows[2])){
//             return switch(rows[0]){
//                 case "🐶" -> bet * 3;
//                 case "🐣" -> bet * 5;
//                 case "🐒" -> bet * 3;
//                 case "🐗" -> bet * 4;
//                 case "🐸" -> bet * 6;
//                 default -> 0;
//             };
//         }
//         return 0;
//     }
// }

// public class Main3{
//     int x = 5;
//     int y = 4;
//     public static void main(String[] args){
//         Main3 myObj = new Main3();
//         Main3 myObj1 = new Main3();
//         Main3 myObj2 = new Main3();
//         System.out.println(myObj.x);
//         System.out.println(myObj1.y);
//         System.out.println(myObj2.x);
//     }
// }

public class Main3{
    public static void main(String[] args){
        Car car = new Car();
        // System.out.println(car.make);
        // System.out.println(car.model);
        // System.out.println(car.year);
        // System.out.println(car.price);
        // System.out.println(car.isRunning);
        // car.start();
        // System.out.println(car.isRunning);
        // car.stop();
        // System.out.println(car.isRunning);
        car.drive();
        car.brake();
    }
}

// public class Main3{
//     public static void main(String[] args){
//         System.out.println(" ");
//     }
// }