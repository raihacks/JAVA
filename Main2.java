 import java.util.Scanner;
 import java.util.Random;
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

// public class Main2{
//     static Scanner sc = new Scanner(System.in);
//     static Random random = new Random();
//     public static void main(String[] args){
//         // DICE ROLLER
//         int n;
//         int totaln=0;
//         System.out.println("Enter your number of dice: ");
//         n = sc.nextInt();
//         if(n>0){
//             for(int i =0; i < n; i++){
//                 int roll = random.nextInt(1,7);
//                 printDie(roll);
//                 System.out.println("You rolled: "+ roll);
//                 totaln += roll;
//                 //System.out.println("Total number of rolls is: "+totaln);
//             }
//             System.out.println("Total number of rolls is: "+totaln);
//         }
//         else{
//             System.out.println("Number of dice can not be less than 0. Please re enter");
//         }

//         System.out.println(" ");
//         // DECLARE VARIABLES
//         // GET # OF DICE FROM USER
//         // CHECK IF # OF DICE > 0
//         // ROLL ALL DICE
//         // GET THE TOTAL
//         // DISPALY ASSII OF DICE
//     }
//     static void printDie(int roll){
//         String dice1 = """   
//                  -------
//                 |       |
//                 |   ꔷ   |
//                 |       |
//                  -------
//                 """;
//         String dice2 = """   
//                  -------
//                 | ꔷ     |
//                 |       |
//                 |     ꔷ |
//                  -------
//                 """;
//         String dice3 = """   
//                  --------
//                 | ꔷ      |
//                 |   ꔷ    |
//                 |      ꔷ |
//                  --------
//                 """;
//         String dice4 = """   
//                  --------
//                 | ꔷ     ꔷ |
//                 |        |
//                 | ꔷ     ꔷ |
//                  --------
//                 """;
//         String dice5 = """   
//                  -------
//                 | ꔷ    ꔷ |
//                 |   ꔷ    |
//                 | ꔷ    ꔷ |
//                  -------
//                 """;
//         String dice6 = """   
//                  --------
//                 | ꔷ    ꔷ |
//                 | ꔷ    ꔷ |
//                 | ꔷ    ꔷ |
//                  --------
//                 """;
//         switch(roll){
//             case 1 -> System.out.println(dice1);
//             case 2 -> System.out.println(dice2);
//             case 3 -> System.out.println(dice3);
//             case 4 -> System.out.println(dice4);
//             case 5 -> System.out.println(dice5);
//             case 6 -> System.out.println(dice6);
//             default -> System.out.println("Invaild roll");
//         }
//     }
// }

// public class Main2{
//     public static void main(String[] args){
//         int[] nums = {1,3,4,56,6,23,33,5};
//         int target = 56;
//         for(int i = 0;i < nums.length;i++){
//             if(target == nums[i]){
//                 System.out.println(i);
//             }
//             //System.out.println(i);
//         }
//         //System.out.println(" ");
//     }
// } 

// public class Main2{
//     public static void main(String[] args){
//         System.out.println(add(1,2,3,4,5));
//         //add(1,2,3,4,5);
//     }
//     static int add(int... numbres){ // ...(ellipsis) packs all variable numbers into an array
//         //System.out.println(numbres);
//         int sum=0;
//         for(int numbre: numbres){
//             sum+=numbre;
//         }
//         return sum;
//     }
// }

// public class Main2{
//     public static void main(String[] args){
//         System.out.println(avrage());
//     }
//     static double avrage(double... nums){
//         double sum = 0;
//         if(nums.length ==0 ){
//             return 0;
//         }
//         for(double num : nums){
//             sum += num;
//         }
//         return sum/nums.length;
//     }
// }

// public class Main2{
//     public static void main(String[] args){
//         String[] careThings ={"hair-brush", "oil", "bottle", "nivea"};
//         String[] electricThings = {"mouse", "cpu", "phone", "lamp"};
//         String[] studyThings = {"pen", "book", "jorunal", "scale"};
//         String[][] things = {careThings, electricThings, studyThings};
//         things[2][3] = "to-doList";
//         for (String[] thing :things){
//             for (String thin : thing){
//                 System.out.print(thin + "  ");
//             }
//             System.out.println();
//         }               
//     }
// }

// public class Main2{
//     public static void main(String[] args){
//         char tele[][]={ {'1', '2', '3'},
//                         {'4', '5', '6'},
//                         {'7', '8', '9'},
//                         {'*', '0', '#'}};
//         for(char[] number:tele){
//             for(char nums:number){
//               System.out.print(nums + "  ");  
//             }
//             System.out.println();
//         }
//     }
// }

public class Main2{
    public static void main(String[] args){
        System.out.println(" ");
    }
}

// public class Main2{
//     public static void main(String[] args){
//         System.out.println(" ");
//     }
// }

