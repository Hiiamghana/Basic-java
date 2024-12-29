package OOPS;

//class Person {
//    String name;
//    int age;
//
//    public void printInfo() {
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//
//    // Non paramiterise Constructor
//    Person() {
//        System.out.println("This is the constructor");
//    }
//}
//
//public class Constructor {
//    public static void main(String[] args) {
//        // Create an instance of the Person class
//        Person p1 = new Person();
//        p1.name = "Biswajit";
//        p1.age = 20;
//
//        // Call the printInfo method
//        p1.printInfo();
//    }
//}

//// peramiterise constructor
//class Person {
//    String name;
//    int age;
//
//    public void printInfo() {
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//    Person(String name, int age){
//        this.name=name;
//        this.age=age;
//    }
//}
//
//    public class Constructor {
//        public static void main(String[] args) {
//            Person p1=new Person("Biswajit",20);
//
//
//            p1.printInfo();
//        }
//    }

// Copy Constructor
class Person{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Person(Person p2){// copy method
        this.name= p2.name;
        this.age= p2.age;
    }
    Person(){

    }

}
public class Constructor{
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Biswajit";
        p1.age=20;

        Person p2=new Person(p1);

        p2.printInfo();
    }
}