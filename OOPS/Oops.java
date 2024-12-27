package OOPS;
// class Pen{
// String color;
// String type;// boll ,gel etc
//
// public void write(){
//     System.out.println(" write something ");
// }
// public void Printcolor(){
//     System.out.println(this.color);
// }
// }
//public class Oops {
//     public static void main(String args[]){
//         Pen pen1=new Pen();
//         pen1.color="black";
//         pen1.type="gel";
//
//         Pen pen2=new Pen();
//         pen2.color="green";
//         pen2.type= " gel";
//
//         Pen pen3=new Pen();
//         pen3.color="blue";
//         pen3.type=" boll";
//
//         pen1.write();
//         pen2.write();
//         pen3.write();
//
//         pen1.Printcolor();
//         pen2.Printcolor();
//         pen3.Printcolor();
//
//     }
// }

class Student{
    String Name;
    int Age;

    public void PrintName(){
        System.out.println(this.Name);
    }
    public void PrintAge(){
        System.out.println(this.Age);
    }
    public static void main(String args[]){
        Student student1=new Student();
        student1.Name="Biswajit";
        student1.Age=20;

        student1.PrintName();
        student1.PrintAge();

    }
}
