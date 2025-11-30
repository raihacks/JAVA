// public class Car{
//     String make ="Ford";
//     String model = "mustang";
//     int year = 2025;
//     double price = 580000.99;
//     boolean isRunning = true;
//     void start(){
//         isRunning = true;
//         System.out.println("You start the engine.");
//     }
//     void stop(){
//         isRunning = false;
//         System.out.println("You stop the engine.");
//     }
//     void drive(){
//         System.out.println("You drive the "+model);
//     }
//     void brake(){
//         System.out.println("You brake the "+model);
//     }
// }

public class Student{
    String name;
    int age;
    double gpa ;
    boolean isEnrolled; 
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    void study(){
        System.out.println(this.name+ " is studing");
    }
}
