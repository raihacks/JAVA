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

// public class Main3{
//     public static void main(String[] args){
//         Car car = new Car();
//         // System.out.println(car.make);
//         // System.out.println(car.model);
//         // System.out.println(car.year);
//         // System.out.println(car.price);
//         // System.out.println(car.isRunning);
//         // car.start();
//         // System.out.println(car.isRunning);
//         // car.stop();
//         // System.out.println(car.isRunning);
//         car.drive();
//         car.brake();
//     }
// }

// public class Main3{
//     public static void main(String[] args){
//         Student student = new Student("anya", 18, 9.8);
//         Student student1 = new Student("sid", 19, 7.4);
//         Student student2 = new Student("loyd", 29, 10.00);
//         // System.out.println(student.name);
//         // System.out.println(student.age);
//         // System.out.println(student.gpa);
//         // System.out.println(student.isEnrolled);
//         // System.out.println(student1.name);
//         // System.out.println(student1.age);
//         // System.out.println(student1.gpa);
//         // System.out.println(student1.isEnrolled);
//         // System.out.println(student2.name);
//         // System.out.println(student2.age);
//         // System.out.println(student2.gpa);
//         // System.out.println(student2.isEnrolled);
//         student.study();
//         student1.study();
//         student2.study();
//     }    
// }

// public class Main3{
//     public static void main(String[] args){
//         User user = new User("aforanya");
//         User user1 = new User("lforloyd", "lforloyd1234@gmail.com");
//         User user2 = new User("yforyor", "yforyor1234@gmail.com", 28);
//         User user3 = new User();
//         // System.out.println(user.username);
//         // System.out.println(user.email);
//         // System.out.println(user.age);
//         // System.out.println(user1.username);
//         // System.out.println(user1.email);
//         // System.out.println(user1.age);
//         // System.out.println(user2.username);
//         // System.out.println(user2.email);
//         // System.out.println(user2.age);
//         System.out.println(user3.username);
//         System.out.println(user3.email);
//         System.out.println(user3.age);
//     }
// }

// public class Main3{
//     public static void main(String[] args){
//         // Car car3 = new Car("mustang", "bule");
//         // Car car1 = new Car("Corvette", "red");
//         // Car car2 = new Car("charger", "black");
//         // Car[] cars = {car3, car1, car2};
//         Car[] cars = {new Car("mustang", "bule"),
//                       new Car("Corvette", "red"),
//                       new Car("charger", "black")};
//         for(Car car : cars){
//             car.color = "black";
//         }
//         for(Car car : cars){
//             car.drive();
//         }
//     }
// }

// public class Main3{
//     public static void main(String[] args){
//         Friend friend1 = new Friend(" ");
//         Friend friend3 = new Friend(" ");
//         Friend friend2 = new Friend(" ");
//         Friend friend4 = new Friend(" ");
//         Friend friend5 = new Friend(" ");
//         Friend.showFriends();
//     }
// }

// public class Main3{
//     public static void main(String[] args){
//         System.out.println(" ");
//     }
// }