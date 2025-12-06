// public class Main{
//     public static void main(String[] args){
//         Student student = new Student(12, "Anya", 123.60f);
//         System.out.println(student);
//     } 
// }
// class Student{
//     int rollno;
//     String name;
//     float marks;
//     Student(int rollno, String name, float marks){
//         this.rollno = rollno;
//         this.name = name;
//         this.marks = marks;
//     }
//     @Override
//     public String toString(){
//         return "Student { rollno = " + rollno +
//                ", name = '" + name + '\'' +
//                ", marks = " + marks +
//                " }";
//     }
// }

public class Main{
    public static void main(String[] args){
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}