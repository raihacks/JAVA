import java.util.Scanner;

//public class Main{
    // public static void main(String[] args){  
    //     Scanner sc =new Scanner(System.in);
    //     String noun1;
    //     String adjective2;
    //     String adjective1;
    //     String verb1;
    //     String adjective3;
    //     String adjective4;
    //     System.out.println("Enter an adjective:");
    //     adjective1 = sc.nextLine();
    //     System.out.println("Enter an adjective:");
    //     adjective2 = sc.nextLine();
    //     System.out.println("Enter an adjective:");
    //     adjective3 = sc.nextLine();
    //     System.out.println("Enter an adjective:");
    //     adjective4 = sc.nextLine();
    //     System.out.println("Enter an noun:");
    //     noun1 = sc.nextLine();
    //     System.out.println("Enter an verb:");
    //     verb1 = sc.nextLine();
    //     System.out.println("hello " + noun1 +"!");
    //     System.out.println("I " +verb1+ " tell  u a story.");
    //     System.out.println("A "+ adjective1 + " " + adjective2+" story!!" );
    //     System.out.println("Hope u enjoy it " + adjective3 +" much this "+adjective4+" story!!");
    //     sc.close();
    // }
//}

// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("what would u like to buy?");
//         String food=sc.nextLine();
//         System.out.println("what is the price for each?");
//         Double price = sc.nextDouble();
//         System.out.println("how many wold u like?");
//         int net = sc.nextInt();
//         Double total= (net * price);
//         System.out.println("You have bought "+net+" "+food+"/s");
//         System.out.println("your total is $"+total);
//         sc.close();
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("plesea enter your name:");
//         String name = sc.nextLine();
//         System.out.print("plesea enter your age:");
//         int age = sc.nextInt();
//         if(age>=18){
//             System.out.println("welcome!! "+name);
//         }
//         else{
//             System.out.println("ur underage!!");
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         Random random = new Random();
//         int number;
//         number = random.nextInt(1,8);
//         System.out.println(number);
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         // System.out.println(Math.PI);
//         // System.out.println(Math.E);
//         // double result;
//         // result = Math.abs(-2);
//         // System.out.println(result);
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the hight of tirangle: ");
//         Double a= sc.nextDouble();
//         System.out.println("Enter the base of tirangle: ");
//         Double b= sc.nextDouble();
//         Double result=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//         System.out.println("the Hypotenuse is " + result);
//         sc.close();
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         String name = "Anya";
//         char firstletter = 'A';
//         int age = 6;
//         double hight = Math.floor(99.5);
//         boolean isStudent = true;
//         System.out.printf("Hello %s!\n", name);
//         System.out.printf("The first letter of ur name is: %c\n", firstletter);
//         System.out.printf("You are %d years old.\n", age);
//         System.out.printf("You'er %.2f cm tall.\n", hight);
//         System.out.printf("Is %s a student: %b\n", name, isStudent);
//         System.out.printf("%s is %d years old.\n", name, age);
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         double price1 = 1200.60;
//         double price2 = 3400000.87;
//         double price3 = -890000000.34;
//         System.out.printf("%,.2f\n", price1);
//         System.out.printf("%,.2f\n", price2);
//         System.out.printf("%,.2f\n", price3);
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         int price1 = 12;
//         int price2 = 34;
//         int price3 = -893;
//         System.out.printf("%-4d\n", price1);
//         System.out.printf("%-4d\n", price2);
//         System.out.printf("%-4d\n", price3);
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         double principal;
//         double rate;
//         int compoundYear;
//         int year;
//         System.out.println("Enter the principal amount: ");
//         principal = sc.nextDouble();
//         System.out.println("Enter the interest rate (in %): ");
//         rate = sc.nextDouble() / 100;
//         System.out.println("Enter the # of times comounded per year: ");
//         compoundYear = sc.nextInt();
//         System.out.println("Enter the # of years: ");
//         year = sc.nextInt();
//         double amount = principal*(Math.pow(1 + (rate/compoundYear),compoundYear*year));
//         System.out.printf("The amount after %d years is $%.2f.\n",year,amount);
//         sc.close();
//     }
// }

// public class Main{
//     public static void main(String[] args){
//        String name = "  Anyasan  ";
//        int lenght = name.length();
//        char letter = name.charAt(4);
//        int index = name.indexOf("s");
//        int lastIndex = name.lastIndexOf("n");
//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("A","S");
//        System.out.println(name.isEmpty());
//        String email = "Bro123@gmail.com";
//        String username = email.substring(0, email.indexOf("@"));
//        String domain = email.substring(email.indexOf("@"));
//        System.out.println(username);
//        System.out.println(domain);
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         String email;
//         String username;
//         String domain;
//         System.out.print("Enter your email: ");
//         email = sc.nextLine();
//         if(email.contains("@")){
//             username = email.substring(0, email.indexOf("@"));
//             domain = email.substring(email.indexOf("@")+1);
//             System.out.println(username);
//             System.out.println(domain);
//         }
//         else{
//             System.out.println("enter the correct email id.");
//         }
//     }
// }

public class Main{
    public static void main(String[] args){

    }
}

// public class Main{
//     public static void main(String[] args){

//     }
// }