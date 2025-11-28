// import java.util.Scanner;
// public class Main2{
//     static Scanner sc = new Scanner(System.in);
//     public static void main(String[] args){
//         //banking program
//         double accBanlance = 2000;
//         int choice;
//             System.out.println("--------------");
//             System.out.println("BANKING PROGRAM");
//             System.out.println("--------------");
//             System.out.println("1. Show my Balance");
//             System.out.println("2. Deposit");
//             System.out.println("3. Withdraw");
//             System.out.println("4. Exit");
//             System.out.println("--------------");
//             System.out.println("Enter your choice(1-4): ");
//             choice =sc.nextInt();
//             if(choice == 1){
//                 System.out.println(showBalance(accBanlance));
//             }
//             else if(choice == 2){
//                 System.out.println(deposit(accBanlance));
//             }
//             else if(choice == 3){
//                 System.out.println(withdraw(accBanlance));
//             }
//             else if(choice == 4){
//                 System.out.println("Thank you for using our sevircs.");
//             }
//             else{
//                 System.out.println("Chosse between 1 to 4");
//             }
        
//     }
//     public static double showBalance(double accBanlance){
//         return accBanlance;
//     }
//     public static double deposit(double accBanlance){
//         System.out.println("Enter the amount to deposit: ");
//         double amount = sc.nextDouble();
//         accBanlance = accBanlance + amount;
//         return accBanlance;
//     }
//     public static double withdraw(double accBanlance){
//         System.out.println("Enter the amount to withdraw: ");
//         Double amount = sc.nextDouble();
//         if(amount>accBanlance){
//             System.out.println("Insuffectine blancee");
//         }
//         else{
//         accBanlance = accBanlance - amount;
//         }
//         return accBanlance;
//     }
// }

// public class BankingProgram {
//     static Scanner sc = new Scanner(System.in);
//     public static void main(String[] args) {
//         double balance = 2000;
//         int choice;
//         while (true) {
//             System.out.println("\n--------------");
//             System.out.println("   BANK MENU");
//             System.out.println("--------------");
//             System.out.println("1. Show Balance");
//             System.out.println("2. Deposit");
//             System.out.println("3. Withdraw");
//             System.out.println("4. Exit");
//             System.out.println("--------------");
//             System.out.print("Enter your choice (1-4): ");
//             choice = sc.nextInt();
//             switch (choice) {
//                 case 1:
//                     System.out.println("Your current balance: " + balance);
//                     break;
//                 case 2:
//                     balance = deposit(balance);
//                     break;
//                 case 3:
//                     balance = withdraw(balance);
//                     break;
//                 case 4:
//                     System.out.println("Thank you for using our services.");
//                     return; //exit 
//                 default:
//                     System.out.println("Invalid choice! Please choose between 1-4.");
//             }
//         }
//     }
//     public static double deposit(double balance) {
//         System.out.print("Enter the amount to deposit: ");
//         double amount = sc.nextDouble();
//         if (amount <= 0) {
//             System.out.println("Deposit amount must be positive.");
//             return balance;
//         }
//         balance += amount;
//         System.out.println("Successfully deposited " + amount);
//         System.out.println("Updated balance: " + balance);
//         return balance;
//     }
//     public static double withdraw(double balance) {
//         System.out.print("Enter the amount to withdraw: ");
//         double amount = sc.nextDouble();
//         if (amount <= 0) {
//             System.out.println("Withdrawal amount must be positive.");
//         } else if (amount > balance) {
//             System.out.println("Insufficient balance!");
//         } else {
//             balance -= amount;
//             System.out.println("Successfully withdrew " + amount);
//         }
//         System.out.println("Updated balance: " + balance);
//         return balance;
//     }
// }

public class Main2{
    public static void main(String[] args){
        
    }
}

// public class Main2{
//     public static void main(String[] args){
        
//     }
// }